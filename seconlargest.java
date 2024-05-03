package Arrays_and_Strings;

import java.util.Scanner;

public class seconlargest {
    
    public static int secondLargest(int arr[], int n) {
		
		int largest = arr[0];
		int secLargest = Integer.MIN_VALUE;
		
		for(int i=1; i<n; i++) {
			if(arr[i]>largest) {
				secLargest = largest;
				largest = arr[i];
			}
			else if(arr[i]<largest && arr[i]>secLargest) {
				secLargest = arr[i];
			}
		}
		return secLargest;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print("Enter the size of array: ");
		
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int sL = secondLargest(arr, n);
		System.out.println(sL);
	}
}
