import java.util.Scanner;

public class QUESTION5 {
	
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	double area,radius,volume;
	System.out.println("Enter the radius of the hemisphere :");
	radius=sc.nextDouble();
	System.out.println("Enter the value of radius :" +radius);
	area=3*Math.PI*Math.pow(radius,3);
	volume=(2.0/3)*Math.PI*Math.pow(radius,3);
	System.out.println("Surface area of hemisphere is :"+area);
	System.out.println("Volume of the hemisphere is :"+volume);
	}	
}

