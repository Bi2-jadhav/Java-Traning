package javaTraning;

public class method_overloading {

	void f1(String s,int i) {
		System.out.println(s + i);
	}
	void f1(int s,int i) {
		System.out.println(s + " "  + i);
	}
	public static void main(String[] args) {
		method_overloading mo = new method_overloading();
		mo.f1(12, 34);
		mo.f1("Renuka", 0);
	}
}
