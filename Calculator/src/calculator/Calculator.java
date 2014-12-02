
package calculator;
import java.util.Scanner;

public class Calculator
{
		
	public static void main(String[] args) 
	
	{
		float a, b, c;
		String p;
		System.out.println("Please enter the first value");
		Scanner x = new Scanner (System.in);
		a=x.nextFloat();

		System.out.println("Please enter the second value");
		Scanner y = new Scanner (System.in);
		b=y.nextFloat();

		System.out.println("Enter the operator");
		Scanner z = new Scanner(System.in);
		p= z.nextLine();
			
			switch (p)
			{
				case "+":
					System.out.println(add(a, b));
					break;
				case "*":
					System.out.println(mul(a, b));
					break;
				case "-":
					System.out.println(sub(a, b));
					break;
			}
	}
public static float add(float a, float b)
	{
		float c=a+b;
		return (c);
	}
public static float sub(float a, float b)
	{
		if (a>b)
		{
			float c=a-b;
			return (c);
		}else
	{
			float c=b-a;
			return (c);
	}
		
	}
public static float mul(float a, float b)
	{
		float c=a*b;
		return (c);
	}
}