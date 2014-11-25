package test2package;

import java.util.Scanner;

public class Test2 
{
	
	public static void main (String args [])
	{
		
		int a=5,b,c;
		Scanner d = new Scanner(System.in);
		System.out.println("Enter the amount you have");
		c = d.nextInt();
		b = c-a;
		{
		
			if (c<a)
			{
				System.out.println("The entered amount is less");
				System.out.println("The minimum amount required is 5");
				
			}
			
			else		
			{
				System.out.println("Thank you for purchasing the item");
				System.out.println("The amount left in your account is"+b);
				
			}
	
		}
	}

}


