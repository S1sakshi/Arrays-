package Arrays_and_Strings;

import java.util.Scanner;

public class merge2arrays {
    
    public static void mergeArrays(int arr1[], int arr2[]) {
		
		int p1 = 0;
		int p2 = 0;
	
		int res[] = new int[arr1.length+arr2.length];
		int rp = 0;
		
		while(p1<arr1.length && p2<arr2.length) {
			if(arr1[p1]<arr2[p2]) {
				res[rp] = arr1[p1];
				p1++;
				rp++;
			}
			else {
				res[rp] = arr2[p2];
				p2++;
				rp++;
			}
		}
		while(p1<arr1.length) {
			res[rp] = arr1[p1];
			p1++;
			rp++;
		}
		while(p2<arr2.length) {
			res[rp] = arr2[p2];
			p2++;
			rp++;
		}
		for(int i=0; i<res.length; i++) {
			System.out.print(res[i]+" ");
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of 1st arr: ");
		int n = sc.nextInt();
		int arr1[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.print("Enter the size of 2nd arr: ");
		int m = sc.nextInt();
		int arr2[] = new int[m];
		
		for(int i=0; i<m; i++) {
			arr2[i] = sc.nextInt();
		}
		mergeArrays(arr1, arr2);
	}
}
