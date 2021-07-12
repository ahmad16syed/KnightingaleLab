package knightingale;

import java.util.Scanner;

public class areaofcircle {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		double r = scan.nextDouble();
		double area = Math.PI * r * r;
		System.out.println("The area of circle is: " + area);
		double circum = 2 * Math.PI * r;
		System.out.println( "The circumference of the circle is:" + circum) ;
	}
}
