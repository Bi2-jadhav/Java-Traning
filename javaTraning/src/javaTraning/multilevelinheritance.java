package javaTraning;

public class multilevelinheritance {
	
	public class c1 {
		public void f1() {
			System.out.println("hello 1");
		}
	}
	
	public class c2 extends c1 {
		public void f2() {
			System.out.println("hello 2");
		}
	}
	
	public class c3 extends c2{
		public void f3() {
			System.out.println("hello 3");
		}
	}
	
	public static void main(String[] args) {
		multilevelinheritance mi = new multilevelinheritance();
		c3 obj = mi.new c3();
		obj.f1();
		obj.f2();
		obj.f3();
	}

}
