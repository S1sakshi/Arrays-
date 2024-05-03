package Arrays_and_Strings;

import java.util.Scanner;

public class rotateArray {
    
    public static void reverse(int arr[], int start, int end) {
		
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
	}
	public static void rotateArray(int arr[], int d) {
		d = d%arr.length;
		
		reverse(arr, 0, arr.length-1);
		
		reverse(arr, 0, d-1);
		reverse(arr, d, arr.length-1);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n = sc.nextInt();

		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
        System.out.print("Enter d: ");
		int d = sc.nextInt();
        
		rotateArray(arr, d);
		
	}
}
