package knightingale;

import java.util.Scanner;

public class oddoreven {
	public static void main(String[] args) {
		Scanner reader =  new Scanner(System.in);
		System.out.println("Enter a number.....:");
		int num =reader.nextInt();
		if(num%2==0)
			System.out.println("The given number is Even");
		else
			System.out.println("The given number is Odd");
	}

}
