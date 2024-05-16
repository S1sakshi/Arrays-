package Arrays_and_Strings;

import java.util.Scanner;

public class checkPalindrome {
    
    public static boolean checkPalindrome(String str) {
		
		int left = 0;
		int right = str.length()-1;
		
		while(left<=right) {
			if(str.charAt(left)!=str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		boolean b = checkPalindrome(str);
		System.out.println(b);
	}
}
