import java.util.*;
//check if the entered number is power of 2
public class powerof2{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n>0  && (n&(n-1))==0)
        {
            System.out.println(n+"is power of 2");
        }
        else
        {
            System.out.println(n+"is not power of 2");

        }
        in.close();
    }
}