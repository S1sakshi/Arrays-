package Arrays_and_Strings;

import java.util.*;

public class selectionSort {
    
    public static void selectionSort(int arr[], int n) {
		
		for(int i=0; i<n; i++) {
			int smallestIndex = i;
			
			for(int j=i; j<n; j++) {
				if(arr[j]<arr[smallestIndex]) {
					smallestIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[smallestIndex];
			arr[smallestIndex] = temp;
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
		selectionSort(arr, n);
	}
}
