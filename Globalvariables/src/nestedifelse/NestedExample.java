package nestedifelse;

import java.util.Scanner;


public class NestedExample {
	
	public int a,b;
	
	public static void main (String args[])
	{
		NestedExample obj1 = new NestedExample();
		NestedExample obj2 = new NestedExample();
		
		System.out.println("Please enter a value");
		Scanner d = new Scanner(System.in);
		obj1.a= d.nextInt();
		
		System.out.println("Please enter second value");
		Scanner e = new Scanner(System.in);
		obj2.b= e.nextInt();
		
		System.out.println("The first value is:" + obj1.a);
		System.out.println("The Second value is:" + obj2.b);
				
	}
	
	
}
