import java.util.Scanner;
public class Q2 {
	public static void main(String[] args) {
		int c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter capacity of water Alice Drank:");
		c= sc.nextInt();
		
		if (c >= 5000)
		System.out.println("Alice following Doctor's Advice");
		else
			System.out.println("Alice did not follow Doctor's Advice");
		
	}

}

