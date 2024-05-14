package Arrays_and_Strings;

import java.util.Scanner;

public class boundariesAndDiagonalSum {
    
    public static void sum(int arr[][]) {
		
		int sum = 0;
		int n = arr.length;
		
		//sum of 0th and (n-1)th row 
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==0 || i==n-1) {
					sum = sum + arr[i][j];
				}
			}
		}
		
		//sum of 0th and (n-1)th column
		for(int i=1; i<n-1; i++) {
			for(int j=0; j<n; j++) {
				if(j==0 || j==n-1) {
					sum = sum + arr[i][j];
				}
			}
		}
		
		//sum of diagonals
		for(int i=1; i<n-1; i++) {
			for(int j=1; j<n-1; j++) {
				if(i==j || i+j==n-1) {
					sum = sum + arr[i][j];
				}
			}
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		
		int arr[][] = new int[n][n];
		System.out.println("Enter array elements: ");
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		sum(arr);
	}
}
