package javaTraning;

import java.util.Scanner;

public class palindrome {
	public static void previouspalindrome(int a) {
		int temp, rev, rem;
		while(true) {
			a--;
			temp = a;
			rem =0; 
			rev = 0;
		while(temp > 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10 ;
		}
		if(rev == a) {
			System.out.println("pervious palindrome " + a);
			break;
		}
		}
	}
	public static void palindrome1(int a) {
		int temp = a;
		int rev =0;
		while( temp>0) {
			int rem = temp % 10; //remainder 
			rev = rev * 10 + rem;
			temp = temp / 10 ;
		}
		if(rev == a) {
			System.out.println("number is palindrome");
		}else {
			System.out.println("number is not palindrome");
		}
	}
	
	public static void nextpalindrome(int a) {
		int temp, rev, rem;
		while(true) {
			a++;
			temp = a;
			rem =0; 
			rev = 0;
		while(temp > 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10 ;
		}
		if(rev == a) {
			System.out.println("next palindrome " + a);
			break;
		}
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("Enter the number ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		previouspalindrome(a);
		palindrome1(a);
		nextpalindrome(a);
	}

}
