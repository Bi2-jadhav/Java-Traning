package javaTraning;

public class ExceptionHandling {

	public static void main(String[] args) {
		System.out.println("main method started");
		int a =10;
		int b=0;
		try {
			int c=a/b;
			System.out.println(c);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("main method stated ");
		System.out.println("main method ended ");

	}

}
