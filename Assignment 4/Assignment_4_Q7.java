package ITER;
import java.util.Scanner;
public class Assignment_4_Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        int n=sc.nextInt();
        int sum=0;
        for (int i = 1; i <= 10; i++) {
            sum=n*i;
            System.out.println(n + "*" + i + "=" + sum);
        }
    }
}
