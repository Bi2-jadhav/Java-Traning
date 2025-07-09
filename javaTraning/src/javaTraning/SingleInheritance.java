package javaTraning;

public class SingleInheritance {
	
	public static class test1 {
		public void f1() {
		System.out.println("parent class");
		}
	}
	
	public static class test2 extends test1{
		public void f2() {
		System.out.println("child class");
		}
	}

	public static void main(String[] args) {
		test2 si= new test2();
		si.f2();
		

	}

}
