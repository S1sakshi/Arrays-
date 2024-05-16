package Arrays_and_Strings;

import java.util.Scanner;

public class removeConsecutiveDuplicates {
    
    public static String removeDuplicates(String str) {
		
		String result = "";
		char ch = str.charAt(0);
		result = result+ch;
		for(int i = 1;i < str.length();i++) {
			if(str.charAt(i) != ch) {
				result = result+str.charAt(i);
			}
			ch = str.charAt(i);
		}
		return result;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String rem = removeDuplicates(str);
		System.out.println(rem);
	}
}
