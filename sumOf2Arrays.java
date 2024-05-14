package Arrays_and_Strings;

import java.util.*;

public class sumOf2Arrays {
    
    public static int[] sum(int arr1[], int arr2[], int output[]){
        int m = arr1.length-1;
        int n = arr2.length-1;
        int c = 0;

        int r = (Math.max(m, n))+1;

        while(m>=0 && n>=0){
            int sum = arr1[m]+arr2[n]+c;
            output[r] = sum%10;
            c = sum/10;
            m--;
            n--;
            r--;
        }
        while(m>=0){
            int sum = arr1[m]+c;
            output[r] = sum%10;
            c = sum/10;
            m--;
            r--;
        }
        while(n>=0){
            int sum = arr2[n]+c;
            output[r] = sum%10;
            c = sum/10;
            n--;
            r--;
        }
        output[0] = c;
        return output;
    } 
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr1[] = new int[n];
        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int arr2[] = new int[m];
        for(int i=0; i<m; i++){
            arr2[i] = sc.nextInt();
        }
        int output[] = new int[Math.max(m, n)+1];
        int res[] = sum(arr1, arr2, output);
        
        for(int i=0; i<res.length; i++){
            System.out.print(res[i]+" ");
        }
    }
}
