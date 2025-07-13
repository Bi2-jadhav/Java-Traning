package javaTraning;
import java.util.Scanner;
public class secondLargest {
	

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int size = sc.nextInt();
		int []a = new int[size];
		System.out.println("Enter the elements");
		for(int i=0;i< size;i++) {
			a[i] = sc.nextInt();
		}
		
		if(size < 2 ) {
			System.out.println("less than 2 no.");
		}
		
		int secondlarge;
		for(int i=0;i< size;i++) {
			for(int j=0; j< size; j++) {
				int temp = a[i];  // bubble sort
				a[i] = a[j];
				a[j] = temp;
			}
		}
		secondlarge = a[size - 2];
		System.out.println("second largest" + secondlarge);
		
		
	}

}
