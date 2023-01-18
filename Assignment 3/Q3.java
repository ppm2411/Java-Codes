import java.util.Scanner;
public class Q3 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter 1st number: ");
		a= sc.nextInt();
		System.out.println("Enter 2nd number: ");
		b= sc.nextInt();
		System.out.println("Enter 3rd number: ");
		c= sc.nextInt();
		if (c>b && b>a)
		 System.out.println("increasing");
		
		else if(a>b && b>c)
			System.out.println("decreasing");
		else
			System.out.println("Neither decreasing nor increasing");
		
		
		
		
	}
}

		
		
		


