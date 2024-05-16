package Arrays_and_Strings;

import java.util.Scanner;

public class countWords {
    
    public static int countWords(String str) {
		int count=1;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==' ') {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int c = countWords(str);
		System.out.println(c);
	}
}
