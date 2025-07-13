package javaTraning;

import java.util.Spliterator;

public class SwapWords {

	public static void main(String[] args) {
		String s = "hello world";
		String word[] = s.split(" ");
		
		for(int i=word.length-1; i>=0 ;i-- ) {
			System.out.print(word[i] + " ");
		}
	}
}
