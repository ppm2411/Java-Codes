/*Write a java program to exchange the values of two variables
 of integer type X and Y using third temporary variable Z*/

public class Q7 {
    public static void main(String[] args ){
        int x=10;
        int y=69;
        int z;
        z=x;
        x=y;
        y=z;
        System.out.println("x="+x);
        System.out.println("y="+y);
    }




}
