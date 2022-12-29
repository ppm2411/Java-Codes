import java.util.Scanner;

public class QUESTION3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double BS;
		double DA,HRA;
		double GS;
		System.out.println("Enter the basic salary of the employee:");
		BS=sc.nextDouble();
		System.out.println("The basic salary of the employer is:"+BS);
		DA=0.4*BS;
		System.out.println("The daily allowance of the employer is:"+DA);
		HRA=0.2*BS;
		System.out.println("The house rent allowance of the employer is:"+HRA);
        GS=BS+DA+HRA;
        System.out.println("The gross salary of the employer is:"+GS);
	}

}
