import java.util.Scanner;

public class QUESTION4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n,n1,n2,n3,n4,n5;
		System.out.println("Enter a number between 0 and 1000");
        int a=sc.nextInt();
        System.out.println("Entered number is :" +a);
		n=a%10;
		n1=a/10;
		n2=n1%10;
		n3=n1/10;
		n4=n3%10;
		n5=n3/10;
		int add=n+n2+n4;
		System.out.println("The sum of digits is:" +add);
			
	}

}
