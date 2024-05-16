package Arrays_and_Strings;

import java.util.Scanner;

public class reverseStringWordwise {
    
    public static String reverseWordwise(String str) {
		
		String rev = "";
		String temp="";
		for(int i=0; i<str.length(); i++) {
			
			temp = temp + str.charAt(i);
			if(str.charAt(i)==' ') {
				rev = temp + " " +  rev;
				temp="";
			}
		}
		return temp + " " + rev;
	}
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String ans = reverseWordwise(str);
		System.out.print(ans);
	}
}
