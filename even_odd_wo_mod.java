import java.util.*;
public class even_odd_wo_mod {
   public static void main(String args[])
   {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
      if ( (n & 1) == 0 )
            System.out.println(n + " is even");
        else
            System.out.println(n + " is odd");

        in.close();


   } 
}
