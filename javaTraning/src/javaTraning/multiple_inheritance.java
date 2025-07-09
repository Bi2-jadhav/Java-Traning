package javaTraning;

interface i1 {
	 void f1();
}
interface i2 {
	 void f2();
}

class c1 implements i1, i2{
	public void f1() {
		System.out.println("Interface 1");
	}
	public void f2() {
		System.out.println("interface 2");
	}
}

public class multiple_inheritance {
	public static void main(String[] args) {
		c1 obj = new c1();
		obj.f1();
		obj.f2();

	}

}
