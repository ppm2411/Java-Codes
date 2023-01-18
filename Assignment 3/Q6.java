
import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		double units,bill;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the units: ");
		units=sc.nextDouble();
		System.out.println("Units entered is : "+units);
		if(units<=50)
		{
			bill=units*3;
			System.out.println("Monthly Electric bill is : "+bill);

		}
		else if(units>=50 && units<=200)
		{
			bill=units*4.80;
			System.out.println("Monthly Electric bill is : "+bill);

		}
		else if(units>=200 && units<=400)
		{
			bill=units*5.80;
			System.out.println("Monthly Electric bill is : "+bill);

		}
		else
		{
			bill=units*6.20;
			System.out.println("Monthly Electric bill is : "+bill);

		}
	}

}
