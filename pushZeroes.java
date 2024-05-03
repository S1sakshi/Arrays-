package Arrays_and_Strings;

import java.util.Scanner;

public class pushZeroes {
    
    public static void pushZeroes(int arr[]) {
		
		int left = 0; //collecting only zeroes
		int right = 0; //collecting non-zeroes only
		
		while(right<arr.length) {
			if(arr[right] == 0) {
				right++;
			}
			else {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right++;
			}
		}
		for(int i=0; i<arr.length; i++) {
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
		pushZeroes(arr);
	}
}
