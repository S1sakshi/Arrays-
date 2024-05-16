package Arrays_and_Strings;

import java.util.Scanner;

public class highestOccuringCharacter {
    
    public static char highestOccuring(String str) {
		
		int arr[] = new int[256];
		for(int i=0; i<str.length(); i++) {
			arr[str.charAt(i)] = arr[str.charAt(i)]+1;
		}
		int max = Integer.MIN_VALUE;
		char ch = ' ';
		for(int i=0; i<str.length(); i++) {
			if(arr[str.charAt(i)]>max) {
				max = arr[str.charAt(i)];
				ch = str.charAt(i);
			}
		}
		return ch;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char c = highestOccuring(str);
		System.out.println(c);
	}
}
