import java.util.*;

/* What a Kaprekar Number 

A Kaprekar number is a number n such that:

If you square it → and split the square into two non-empty parts,
then the sum of those two parts equals the original number.

Formally:
n is Kaprekar if there exists a split of n² into L and R such that
L + R = n and both parts are non-empty (i.e., right part ≠ 0). */

public class kapvikar {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int sq=n*n;
        //to find the number of digits in sqrd num
        int digits = 0;
        int temp=sq;
        while (temp > 0) {
            digits++;
            temp /= 10;
            
        }
        boolean isKaprekar=false;
        for(int i=1;i<=digits;i++)
        {
            int divisor=(int)Math.pow(10,i);
            int left=sq/divisor;
            int right=sq%divisor;
            // ❗ Skip cases where right part is zero
    if (right == 0) continue;


            if(left+right==n)
            {
                isKaprekar=true;
                break;
            }
            

        }
        
        if(n==1||isKaprekar)
        {
            System.out.println(n+"is Kaprekar number");
        }
        else{
            System.out.println(n+"is not Kaprekar number");
        }
        in.close();

    }
}
