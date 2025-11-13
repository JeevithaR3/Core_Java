import java.util.*;
public class palindrom {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int rev=0;
        int originalnum=num;
        while(num>0)
        {
            int digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        if(originalnum==rev)
        {
            System.out.println("Palindrome number");
        }
        else{
            System.out.println("Not palindrome");
            
        }
        }
    }

