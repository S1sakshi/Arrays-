package Arrays_and_Strings;

import java.util.Arrays;
import java.util.Scanner;

public class checkPermutation {
    
    public static boolean checkPermutation(String str1, String str2) {
		
		int n1 = str1.length();
		int n2 = str2.length();
		
		if(n1!=n2) {
			return false;
		}
		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		for(int i=0; i<ch1.length; i++) {
			if(ch1[i]!=ch2[i]) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		boolean b = checkPermutation(str1, str2);
		System.out.println(b);
		
	}
}
