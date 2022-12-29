import java.util.Scanner;

public class QUESTION6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        double t,d;
        System.out.println("Enter time in seconds :");
        t=sc.nextDouble();
        System.out.println("time in seconds is :"+t);
        d=0.5*32.174*t*t;
        System.out.println("Distnce travelled is :"+d);
      
	}

}
