package claculator;

import java.util.Scanner;

public class Calculator

{
	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		System.out.println( "Choose an operation: ");
		System.out.println("1. addition");
		System.out.println("2. subtraction");
		System.out.println("3.multipcation");
		System.out.println("4. exponents");
		int response = userInput.nextInt();


		if (response == 1)
		{
		
			System.out.println("choose one number to add");
			int response1 = userInput.nextInt();
			System.out.println("chooose a second number");
			int response2 = userInput.nextInt();
			System.out.println("the answer is: " + add(response1, response2));

		}
		else if (response == 2)
		{
			
			System.out.println("choose one number to subtract");
			int response1 = userInput.nextInt();
			System.out.println("chooose a second number");
			int response2 = userInput.nextInt();
			System.out.println("the answer is: " + subtract(response1, response2));
		}
		else if (response == 3)
		{
			
			System.out.println("choose one number to multiply");
			int response1 = userInput.nextInt();
			System.out.println("choose a second number");
			int response2 = userInput.nextInt();
			System.out.println("the answer is: " + multiply(response1, response2));
		}
		else 
		{
			
			System.out.println("choose one base number");
			int response1 = userInput.nextInt();
			System.out.println("choose one exponent");
			int response2 = userInput.nextInt();
			System.out.println("the answer is: " + exponent(response1, response2));
		}
	}
	public static double add(double x, double y)
	{
		return y + x;
	}
	public static double subtract (double x, double y)
	{
		return y - x;
	}
	public static double multiply (double x, double y)
	{
		return y * x;
	}
	public static double exponent (double x, double y)
	{
		return Math.pow(x, y);
	}
}
