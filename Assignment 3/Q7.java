import java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {
		double units,bill;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the units: ");
		units=sc.nextDouble();
		System.out.println("Units consumed : "+units);
		if(units<=50)
		{
			bill=units*3;
			System.out.println("Monthly Electric bill is : "+bill);

		}
		else if(units<=200)
		{
			bill=50*3+(units-50)*4.80;
			System.out.println("Monthly Electric bill is : "+bill);

		}
		else if(units<=400)
		{
			bill=50*3+150*4.80+(units-200)*5.80;
			System.out.println("Monthly Electric bill is : "+bill);

		}
		else if(units> 400)
		{
			bill=50*3+150*4.80+200*5.80+(units-400)*6.80;
			System.out.println("Monthly Electric bill is : "+bill);
			
			System.out.println("Do you want to pay online? (Y/N)");
			char x= sc.next().charAt(0);
			if(x=='Y')
			{ 
				double n= 0.3*bill;
				double g= bill-n;
				
				System.out.println("You got a discount of 3% i.e Amount="+g);
			    }
				else if (x=='N')
					{System.out.println("Thank you");
					
					}
					
		}
			}

		}
		



	

