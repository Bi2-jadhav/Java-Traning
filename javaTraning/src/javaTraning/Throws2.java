package javaTraning;

public class Throws2 {

	public static void main(String[] args) {
		try {
			divide(10,0);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
	public static void divide(int a, int b) {
		if(b==0) {
			throw new ArithmeticException("can nto divide by");
		}
		int c = a/b;
		System.out.println("result" + c);
	}

}
