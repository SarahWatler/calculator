package claculator;

import java.util.Scanner;

public class Calculator
	{
		public static void main(String[] args)
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println( "Choose an operation: ");
		System.out.println("1. addition, 2. subtraction, 3. multipication, 4. exponents");
		int response = userInput.nextInt();
		
		
	    if (response == 1)
			{
				System.out.println("choose two numbers");
				add();
			}
	    else if (response == 2)
	    	{
	    		System.out.println("choose two numbers");
	    		subtract();
	    	}
	    else 
	    	{
	    		System.out.println("choose two numbers");	
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
		public static double exponents (double x, double y)
		{
			return Math.pow(x, y);
		}
	}
		