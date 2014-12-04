package billing;

import java.util.Scanner;

public class Customerdetails {

	public static String details()
	{
		String n, eid, prod;
		Double cont;
		System.out.println("Enter the customer Name");
		Scanner name = new Scanner(System.in);
		n = name.nextLine();
		
		
		System.out.println("Enter the customer EmailID");
		Scanner email = new Scanner(System.in);
		eid = email.nextLine();
		
		
		System.out.println("Enter the customer Contact number");
		Scanner contact = new Scanner(System.in);
		cont = contact.nextDouble();
		
		
		System.out.println("Enter the Product Name");
		Scanner product = new Scanner(System.in);
		prod = product.nextLine();
		return (n + eid + cont + prod);
	}
}
