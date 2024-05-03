package Arrays_and_Strings;

import java.util.Scanner;

public class insertionSort {
    
    public static void insertionSort(int arr[], int n) {
		
		for(int i=1; i<n; i++) {
			
			int j = i-1;
			int current = arr[i];
			
			while(j>=0 && arr[j]>current) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = current;
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
		insertionSort(arr, n);
	}
}
