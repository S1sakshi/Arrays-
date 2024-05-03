package Arrays_and_Strings;

import java.util.*;

public class bubbleSort {
    
    public static void bubbleSort(int arr[], int n) {
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-1-i; j++) {
				
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
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
		bubbleSort(arr, n);
	}

}
