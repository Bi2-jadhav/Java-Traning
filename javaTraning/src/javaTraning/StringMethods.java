package javaTraning;

public class StringMethods {
	
	public static char charAt(int index) {
		String s = "pratap";
		return s.charAt(index);
	}
	public static String Concat(String s) {
		s = s.concat(" solution");
		return s;
	}
	public static Boolean equals(String s) {
		return s.equals(" shinde");
	}
	public static Boolean equalsIgnoreCase(String s) {
		return s.equalsIgnoreCase("pratap");
	}
	public static Boolean isempty() {
		String s = " ";
		return s.isEmpty();
	}
	public static int length() {
		String s = "pratap";
		return s.length();
	}
	public static String replace(String s) {
		return s.replace('p','P');
	}
	public static String substring(int begin) {
		String s = "abcdefgh";
		return s.substring(begin);
	}
	public static String substring(int begin, int end) {
		String s ="werefddv";
		return s.substring(begin, end);
	}
	public static int indexOf(char ch) {
		String s = "pratap";
		return s.indexOf(ch);
	}
	public static int lastIndexOf(char ch) {
		String s = "pratap" ;
		return s.lastIndexOf(ch);
	}
	public static String trim() {
		String s = "   Pratap Shinde";
		return s.trim();
	}
	public static void main(String[] args) {
		System.out.println("char at 3rd index" + charAt(3));
		System.out.println("concating 2 string " + Concat("pratap"));
		System.out.println("is 2 strings are equal" + equals("Pratap"));
		System.out.println("equals igonre case " + equalsIgnoreCase("Pratap"));
		System.out.println("is empty string or not " + isempty());
		System.out.println("length of string " + length());
		System.out.println("replace string " + replace("pratap"));
		System.out.println("substring " + substring(3));
		System.out.println("substring form one index to another "+substring(2,6));
		System.out.println("index "+indexOf('c'));
		System.out.println("last index " + lastIndexOf('a'));
		System.out.println("trim " + trim());
	}

}
