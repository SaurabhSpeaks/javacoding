//Calculator Program for Java
	import java.util.Scanner
	public class Calculator{

		public static void main(String[] args) {
			
			float a, b, c;
			String p;

			System.out.println("Please enter the first value");
			Scanner x = new Scanner (System.in);
			a=x.nextFloat();

			System.out.println("Please enter the second value");
			Scanner x = new Scanner (System.in);
			b=x.nextFloat();

			System.out.println("Enter the operator");
			Scanner x = new Scanner(System.in);
			p=x.nextLine();

			switch (p)
			{

				case '+':
				add();
				break;

				case '*':
				mul();
				break;

				case '-':
				sub();
				break;
			}

		}

		public float add(a, b)
		{
			c=a+b;
			return (c);
			

		}

		public float sub( a, b)
		{
			if (a>b)
				{

					c=a-b;
				}else
				{
					c=b-a;
				}
			return (c);
			

		}

		publi float mul(a, b)
		{
			c=a*b;
			return (c);
			
		}
	}