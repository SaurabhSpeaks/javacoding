package billing;

import java.util.Scanner;

public class Customerdetails extends Invoice {
	String n, eid, prod;
	Double cont;
	public static String details()
	{
		Customerdetails obj = new Customerdetails();
		
		System.out.println("Enter the customer Name");
		Scanner name = new Scanner(System.in);
		obj.n = name.nextLine();
		
		
		
		System.out.println("Enter the customer EmailID");
		Scanner email = new Scanner(System.in);
		obj.eid = email.nextLine();
		
		
		System.out.println("Enter the customer Contact number");
		Scanner contact = new Scanner(System.in);
		obj.cont = contact.nextDouble();
		
		
		System.out.println("Enter the Product Name");
		Scanner product = new Scanner(System.in);
		obj.prod = product.nextLine();
		
		Invoice.invoice();
		Invoice.total();
		return (obj.n);
		
	}
}
