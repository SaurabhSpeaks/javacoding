package adcalculator;
import java.util.Scanner;
public class Adcalculator {
	
	public static void main(String args[])
	{
		float a, b, c;
		String p;
		
		System.out.println("Enter the first value");
		Scanner x = new Scanner(System.in);
		a=x.nextFloat();
		
		System.out.println("Enter the second value");
		Scanner y = new Scanner(System.in);
		b=y.nextFloat();
		
		System.out.println("Enter the operator");
		Scanner z = new Scanner(System.in);
		p=z.nextLine();
		
		switch (p)
		{
		
		case "+":
		add(a,b);
		System.out.println(add(a,b));
		break;
		
		case "*":
			mul(a,b);
			System.out.println(mul(a,b));
			break;
				
		case "/":
			dev(a,b);
			System.out.println(dev(a,b));
			break;
			
		case "%":
			per(a,b);
			System.out.println(per(a,b));
		}
	}
	
	public static float add(float f, float g)
	{
		float z = f+g;
				return(z);
		
	}
	
	public static float mul(float p, float q)
	{
		float mul = p*q;
				return(mul);
		
	}
	
	public static float dev(float var1, float var2)
	{
		float devide = var1/var2;
				return(devide);
		
	}
	
	public static float per(float v1, float v2)
	{
		float perc = v1*v2/100;
				return(perc);
		
	}


}
