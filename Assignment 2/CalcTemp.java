import java.util.Scanner;
public class CalcTemp{
         public static void main(String[] args){
                  Scanner sc=new Scanner(System.in);
                  double Fahrenheit;
                  double celcius;
                  System.out.println("Enter the temperature in fahrenheit: ");
                  Fahrenheit=sc.nextDouble();
                  celcius=(Fahrenheit-32.0)*(5.0/9.0);
                  System.out.println("fahrenheit in celcius: "+celcius);



         }
}
