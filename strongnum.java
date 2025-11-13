import java.util.*;
/*A Strong Number (also called a Krishnamurthy Number) is a number in which
the sum of the factorials of its digits equals the number itself.*/
public class strongnum {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int temp=n;
        int sum=0;
        while(n>0)
        {
            int digit=n%10;  //extract the last digit
            int fact=1;
            for(int i=1;i<=digit;i++)
            {
                fact*=i;  //find the factorial of that digit
            }
            sum+=fact;
            n/=10; //remove the last digit since we hvae already computed the factorial 
            
        }
        if(sum==temp)
        {
            System.out.println("Strong number");
        }
        else{
            System.out.println("not a strong number");
        }
        in.close();
    
    }
    
}
