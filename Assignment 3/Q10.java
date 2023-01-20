import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {
        int marks;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Marks :");
        marks = sc.nextInt();

        switch (marks/10){
            
            case 9 :
                System.out.print("Your Grade Is: O");
                break;
            case 8 :
                System.out.print("Your Grade Is: A " );
                break;
            case 7 :
                System.out.print("Your Grade Is: B " );
            case 6 :           
                System.out.print("Your Grade Is: C " );
                break;
            case 5 :
                System.out.print("Your Grade Is: D " );
                break;
            case 4 :           
                System.out.print("Your Grade Is: E ");
                break;
            default :
                System.out.print("You Grade Is: F ");
            
        }
    }
}

