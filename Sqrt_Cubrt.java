import java.lang.Math;

import java.util.Scanner;

public class Sqrt_Cubrt {
	
	private static Scanner input;

	public static void main(String[] args) {
		double number;
		input = new Scanner(System.in);
		System.out.println("Enter the Number:" );  
		number = input.nextDouble();
System.out.println("SQUARE ROOT:" +Math.sqrt(number));
System.out.println("CUBE ROOT:" +Math.cbrt(number));
	}
	
}
