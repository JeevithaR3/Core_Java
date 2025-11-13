/*An Armstrong number (also called a narcissistic number) is a number that is equal 
to the sum of its own digits each raised to the power of the number of digits.*/
import java.util.*;
public class armstrong {
    static boolean isArmstrong(int num)
    {
        int originalNum=num;
        int digit;
        int sum=0;
        int digits=String.valueOf(num).length(); //to count the no of digits
        while(num>0){
            digit=num%10;
            sum+=Math.pow(digit,digits);
            num=num/10;

        }
        return sum==originalNum;
    }

        public static void main(String args[])
        {
            Scanner in=new Scanner(System.in);
            int num=in.nextInt();
            if(isArmstrong(num))
            {
                System.out.println("Armstrong number");
            }
            else{
                System.out.println("Not an armstrong number");
            }
            in.close();

        }
        

    
}
