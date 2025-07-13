package javaTraning;

public class memoryAllocation {
	int id;
	String name;
	static String collegeName = "Keystone";
	memoryAllocation(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public void display() {
		System.out.println(name + " " + id + " " + collegeName);
	}
	
	public static void main(String[] args) {
		memoryAllocation ma = new memoryAllocation(1,"bitu");
		ma.display();
	}

}


 
