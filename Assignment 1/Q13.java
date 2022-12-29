//Scanner Java Program
import java.util.Scanner;
public class Q13 {
    public static void main(String[] args) {
    Scanner SC = new Scanner(System.in);

    System.out.println("Enter name, age and salary:");

    // String input
    String name = SC.nextLine();

    // Numerical input
    int age = SC.nextInt();
    double salary = SC.nextDouble();

    // Output input by user
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Salary: " + salary);
  }
}
    

