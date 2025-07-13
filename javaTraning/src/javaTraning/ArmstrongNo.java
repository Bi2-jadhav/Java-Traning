package javaTraning;

public class ArmstrongNo {

	public static void main(String[] args) {
		int i = 678;
		int temp = i;
		int r , sum = 0;
		while (temp > 0 ) {
			r = temp % 10;
			temp = temp/10;
			sum = sum + r *r*r;
		}
		if(i == sum) {
			System.out.println("number is armstrong");
		}
		else {
			System.out.println("number is not armstrong");
		}
	}

}
