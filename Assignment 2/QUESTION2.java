import java.util.Scanner;

public class QUESTION2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double km;
		
		
		
		System.out.println("Enter the distance between the two cities in km: ");
		km=sc.nextDouble();
		double metre = 1000*km;
		double inches = 3930.0780*km;
		double feet = 3280.933*km;
		double cm = 10000*km;
		System.out.println("Distance converted to m= "+metre+" cm= "+cm+" inches= "+inches+" feet= "+feet);
	}}
		
		
		
