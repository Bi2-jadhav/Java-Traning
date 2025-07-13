package javaTraning;

public class Constructor_Overloading {
	int a ; double b ; String c; 
	
	Constructor_Overloading(){
		a = 12;
		b = 45.89;
		c = "pratap";
	}
	Constructor_Overloading(int x){
		a = x;
	}
	Constructor_Overloading(double q, String r){
		b = q;
		c = r;
	}
	
	public static void main(String[] args) {
		// allows reassigning the values 
		Constructor_Overloading C = new Constructor_Overloading();
		Constructor_Overloading co = new Constructor_Overloading(23);
		Constructor_Overloading co2 = new Constructor_Overloading(78.90, "renuka");
		System.out.println(C.a + " "+ C.b + " " + C.c);
		System.out.println(co.a);
		System.out.println(co2.b + " " +co2.c);
	}
}
