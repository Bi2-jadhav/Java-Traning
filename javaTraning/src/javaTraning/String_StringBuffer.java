package javaTraning;

public class String_StringBuffer {

	public static void main(String[] args) {
		String s =new String("pratap");
		s.concat("software");
		System.out.println(s);
		
		StringBuffer sb = new StringBuffer("pratap");
		sb.append(" solutions");
		System.out.println(sb);
		
		String s1 = new String("pratap");
		System.out.println(s == s1);  // false
		System.out.println(s.equals(s1)); // true
		
		StringBuffer sb1 = new StringBuffer("pratap");
		System.out.println(sb == sb1);
		System.out.println(sb.equals(sb1));
		
		
	}


}
