package Arrays_and_Strings;

import java.util.Scanner;

public class compressTheString {
    
    public static String compressString(String str) {
		
		String ans = "";
		
		char ch = str.charAt(0);
		ans = ans + str.charAt(0);
		int count = 1;
		for(int i=1; i<str.length(); i++) {
			
			if(str.charAt(i)==ch) {
				count++;
			}
			else {
				if(count>1) {
					ans = ans+count;
				}
				ans = ans + str.charAt(i);
				count = 1;
			}
			ch = str.charAt(i);
		}
		if(count>1) {
			return ans+count;
		}
		return ans;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String newString = compressString(str);
		System.out.println(newString);
	}
}
