package javaTraning;

import java.util.Scanner;

// count the uppercase and lowercase character from the given string  
public class check_upper_lower {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int upper = 0;
		int lower = 0;
		for(int i = 0 ; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' &&  ch <= 'Z') {  // instead of "A and Z" it can be "65 to 90" for upper and above 90 for lower 
				upper++;
			}
			else {
				lower++;
			}
		}
		System.out.println("upper" + upper);
		System.out.println("lower" + lower);
	}
}