package Arrays_and_Strings;

import java.util.Scanner;

public class removeChar {
    
    public static String removeCharacter(String str, char ch) {
		
		String ans = "";
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)!=ch) {
				ans = ans + str.charAt(i);
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch = sc.next().charAt(0);
		String rev = removeCharacter(str, ch);
		System.out.print(rev);
	}
}
