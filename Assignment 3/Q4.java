import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		int x;
		Scanner sc=new Scanner(System.in);
		int y=(int)(Math.random()*9+1);
		System.out.println("Enter a number by user: ");
		x=sc.nextInt();
		System.out.println("The entred number is:"+x);
		System.out.println("Guess by computer is: "+y);
		if(x==y)
		{
			System.out.println("Guess is corrrect");
		}
		else if(x==y+1 || x==y-1)
		{
			System.out.println("Guess is almost correct");

		}
		else
		{
			System.out.println("Guess is wrong");

		}
		
		
		

	}

}
