package knightingale;

public class swap2num {
	public static void main(String[] args) {
		float a=5.60f, b=6.20f;
		System.out.println("Before swap.....:");
		System.out.println("First num.....:" + a);
		System.out.println("Second num.....:" + b );
		
		float x = a;
		a = b;
		b = x;
		System.out.println("After swap.....:");
		System.out.println("First num.....:" + a);
		System.out.println("Second num.....:" + b );
	}

}
