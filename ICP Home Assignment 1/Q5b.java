public class Q5b {
   public static void main(String[] args){

        System.out.println("exchanging without using variable");
           int w= 10;
           int g= 35;
           int k= 49;
           int a= 71;
        
            a= w+g+k+a;
            k= a-w-g-k;
            g= a-k-g-w;
            w=a-k-g-w;
            a= a-k-g-w;
            System.out.println(w);
            System.out.println(g);
            System.out.println(k);
            System.out.println(a);
        
        }}
   

    

