package knightingale;

import java.util.Scanner;

public class areaofsquare {
	public static void main(String[] args) {
		System.out.println("Enter Side of Square:"); 
		Scanner scan = new Scanner(System.in); 		 
		double s = scan.nextDouble();		 
		double area = s * s;
		System.out.println("Area of Square is: " + area);
	}
}
