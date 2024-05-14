package Arrays_and_Strings;

import java.util.Scanner;

public class largestRow_or_Coumn {
    
    public static void largest(int arr[][], int n, int m) {
		
		int largestRowSum = 0;
		int largestColumnSum = 0;
		int row = 0;
		int column = 0;
		//to check Row sums
		for(int i=0; i<n; i++) {
			int sum = 0;
			for(int j=0; j<m; j++) {
				sum = sum+arr[i][j];
			}
			if(sum>largestRowSum) {
				largestRowSum = sum;
				row = i;
			}
		}
		for(int j=0; j<m; j++) {
			int sum=0;
			for(int i=0; i<n; i++) {
				sum = sum+arr[i][j];
			}
			if(sum>largestColumnSum) {
				largestColumnSum = sum;
				column = j;
			}
		}
		if(largestRowSum>largestColumnSum) {
			System.out.println("row "+row+" "+largestRowSum);
		}
		else {
			System.out.println("column "+column+" "+largestColumnSum);
		}
	}
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int arr[][] = new int[n][m];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				arr[i][j]= sc.nextInt();
			}
		}
		largest(arr, n, m);
	}
}
