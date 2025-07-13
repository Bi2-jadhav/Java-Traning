package javaTraning;

public class FibonacciSeries {

	public static void main(String[] args) {
		int fib = 0;
		int fib1 =1;
		System.out.println("fibonacci" + fib);
		
		for(int i=1;i<10;i++) {
			i = fib+fib1;
			fib = fib1;
			fib1 = i;
			System.out.println(fib);
		}
		
	}
}
