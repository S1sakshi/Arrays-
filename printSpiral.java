package Arrays_and_Strings;

import java.util.*;

public class printSpiral {
    
    public static void printSpiral(int arr[][]) {
		
		int rs = 0;
		int re = arr.length-1;
		int cs = 0;
		int ce = arr[0].length-1;
		
		int count = arr.length*arr[0].length;
		
		while(count>0) {
			for(int j=cs; j<=ce && count>0; j++) {
				System.out.print(arr[rs][j]+" ");
				--count;
			}
			rs++;
			
			for(int i=rs; i<=re && count>0; i++ ) {
				System.out.print(arr[i][ce]+" ");
				--count;
			}
			ce--;
			
			for(int j=ce; j>=cs && count>0; j--) {
				System.out.print(arr[re][j]+" ");
				--count;
			}
			re--;
			
			for(int i=re; i>=rs && count>0; i-- ) {
				System.out.print(arr[i][cs]+" ");
				--count;
			}
			cs++;
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
        int arr[][] = new int[n][m];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		printSpiral(arr);
	}
}
