import java.util.Scanner;
public class Q5 {
	public static void main(String[] args) {
		
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year: ");
		year= sc.nextInt();
		

		if (year%400==0)
			System.out.println("A leap year");
		if(year%4==0)
			if(year%100!=0)
				System.out.println("A leap year");
			else
				System.out.println("Not a leap year");
		
	

	}

}