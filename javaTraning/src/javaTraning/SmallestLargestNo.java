package javaTraning;
import java.util.*;
public class SmallestLargestNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of elements");
		int size = sc.nextInt();
		System.out.println("Enter the number");
		int a[] = new int[size];
		for(int i=0;i<size ; i++) {
			a[i] =  sc.nextInt();
		}
		
		int small =a[0] ;int large = a[0]; 		
		for(int i=0;i<size ; i++) {
			if(a[i] > large) {
				large = a[i];
			}
			if(a[i] < small) {
				small = a[i];
			}
		}
		System.out.println("small " + small);
		System.out.println("large " + large);
		
	}

}
