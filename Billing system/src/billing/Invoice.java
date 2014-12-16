package billing;
import java.util.Scanner;
public class Invoice {
	float amou, vat, tamou; 
	public static void invoice()
	{
		
		float inum;
		
		System.out.println("Enter the invoice number");
		Scanner invnum = new Scanner(System.in);
		inum = invnum.nextFloat();
		
		
		
	}
	
	public static float total()
	{
		
Invoice obj = new Invoice();
		
		System.out.println("Enter the invoice amount");
		Scanner invamou = new Scanner(System.in);
		obj.amou = invamou.nextFloat();
		
		System.out.println("Enter the % vat");
		Scanner invat = new Scanner(System.in);
		obj.vat = invat.nextFloat();
		
		obj.tamou = (obj.vat * obj.amou/100)+obj.amou;
		return (obj.tamou);
		
	}
	

}
