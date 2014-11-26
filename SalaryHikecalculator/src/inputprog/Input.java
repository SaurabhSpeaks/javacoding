/**
 * 
 */
package inputprog;

import java.util.Scanner;

/**
 * @author admin
 *
 */
public class Input {
	
	public static void main(String args[]) 
	
		{
		// TODO Initiating variables
		int a, b;
		
		// Creating an object of the Scanner class to get the input from the user
		Scanner c = new Scanner (System.in);
		Scanner d = new Scanner (System.in);
		
		// Printing the statement to enter the salary.
		System.out.println("Please enter the salary you have");
		
		// Command to enter the amount into the variable a 
		a=c.nextInt(); 
		
		System.out.println("Please enter your expected salary with this hike");
		
		b=d.nextInt();
		
			if(b>a)
			{
				int e=b-a;
				int f= (5000*100/25000);
				System.out.println("The hike requested is of:" +e);
				
				
				System.out.println("The % of hike requested is:" +f);
				
			}
			
			else
			{
				System.out.println("Invalid salary hike is requested");
				
			}
		
		

		}

}
