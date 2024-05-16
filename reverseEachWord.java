package Arrays_and_Strings;

import java.util.Scanner;

public class reverseEchWord {
    
    public static String reverseEachWord(String str) {
		
		String rev = "";
		String temp = "";
		
		for(int i=0 ;i<str.length(); i++) {
			
			if(str.charAt(i)==' ') {
				rev = rev + temp + " ";
				temp = "";
			}
			else {
				temp = str.charAt(i)+temp;
			}
		}
		return rev + temp + " ";
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String rev = reverseEachWord(str);
		System.out.print(rev);
	}
}
