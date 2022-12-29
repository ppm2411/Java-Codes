/*Write a java program to exchange the values of two variables of integer 
type X and Y without using third temporary variable. */

public class Q8 {
    public static void main(String[] args){
        System.out.println("Before swapping");
        int x= 15;
        int y = 10;
        System.out.println("value of x: "+x);
        System.out.println("value of y:"+y);
        x= x+y;
        y= x-y;
        x= x-y;
        System.out.println("After swapping");
        System.out.println("value of x: "+x);
        System.out.println("value of y:"+y);
    }
    
}
