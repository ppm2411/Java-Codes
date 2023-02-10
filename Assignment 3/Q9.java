import java.util.Scanner;
public class Q9 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter value of a: ");
		a= sc.nextInt();
		System.out.println("Enter value of b: ");
		b= sc.nextInt();
		System.out.println("Enter value of c: ");
		c= sc.nextInt();
		
		if(a>b && b>c)
		{ System.out.println("Largest number is: "+a);
		System.out.println("2nd largest number is: "+b);
		}
		else if (b>a && a>c )
		{System.out.println("Largest Number is : "+b);
		System.out.println("2nd largest Number is: "+a);
		
		}
		else if(c>a && a>b)
		{System.out.println("Largest Number is : "+c);
		System.out.println("2nd largest Number is: "+a);
		}
		else if(a>c && c>b)
		{System.out.println("Largest Number is : "+a);
		System.out.println("2nd largest Number is: "+c);}
		else if(c>b && b>a)
		{System.out.println("Largest Number is : "+c);
		System.out.println("2nd largest Number is: "+b);}
		else 
		{System.out.println("Largest Number is : "+b);
		System.out.println("2nd largest Number is: "+c);
		}} 
    
}
