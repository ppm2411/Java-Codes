import java.util.Scanner;
public class Q8{

public static void quadrant(int x, int y){
	
		if (x > 0 && y > 0)
			System.out.println("lies in First quadrant");

		else if (x < 0 && y > 0)
			System.out.println("lies in Second quadrant");

		else if (x < 0 && y < 0)
			System.out.println("lies in Third quadrant");

		else if (x > 0 && y < 0)
			System.out.println("lies in Fourth quadrant");

		else if (x == 0 && y > 0)
			System.out.println("lies at positive y axis");

		else if (x == 0 && y < 0)
			System.out.println("lies at negative y axis");

		else if (y == 0 && x < 0)
			System.out.println("lies at negative x axis");

		else if (y == 0 && x > 0)
			System.out.println("lies at positive x axis");

		else
			System.out.println("lies at origin");
	}
	
	
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
	
		int x,y;
		System.out.println("Enter coordinate of x: ");
		x= sc.nextInt();
		
		System.out.println("Ener coordinate of y: ");
		y=sc.nextInt();
		
		
		quadrant(x, y);
	}


		
		
	 
    
}
