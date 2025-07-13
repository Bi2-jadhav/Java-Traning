package javaTraning;

public class Encapsulation {
	private int i =10;
	private String s ="pratap";
	
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	
	public static void main(String[] args) {
		Encapsulation e = new Encapsulation();
		e.setI(90) ;
		System.out.println(e.getI());
		e.setS("sdfdfg");
		System.out.println(e.getS());

	}

	
}
