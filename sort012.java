package Arrays_and_Strings;

import java.util.Scanner;

public class sort012 {
    
    public static void swap(int arr[], int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	public static void sort(int arr[], int n) {
		int lp = 0;
		int mp = 0;
		int rp = arr.length-1;
		
		while(mp<=rp) {
			if(arr[mp]==0) {
				swap(arr, mp, lp);
				if(lp==mp) {
					lp++;
					mp++;
				}
				else {
					lp++;
				}
			}
			else if(arr[mp]==2) {
				swap(arr, mp, rp);
				rp--;
			}
			else {
				mp++;
			}
		}
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		sort(arr, n);
	}
}
