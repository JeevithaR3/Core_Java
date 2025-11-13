/*What is a Happy Number?
A number is called Happy if:
1.	You replace the number by the sum of the squares of its digits
2.	Repeat the process
3.	If the result becomes 1, it is a Happy Number
19 → 1² + 9² = 82
82 → 8² + 2² = 68
68 → 6² + 8² = 100
100 → 1² + 0² + 0² = 1 ✔
What is a Sad Number?
If the number never reaches 1 and instead enters a loop,
then it is a Sad Number (also called Unhappy Number).
These numbers always eventually reach 4 in their loop.
20 → 4 + 0 = 4
4 → 16 → 37 → 58 → 89 → 145 → 42 → 20 → ...*/
// 1 is happy number

import java.util.*;
public class happyno {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int temp=n;

        /* the rule of a Happy Number is to keep repeating the sum of squares until:

it becomes 1 → Happy number ✅

or it becomes 4 → Sad number ❌ (since all unhappy numbers enter a loop that includes 4) */
        while(n!=1 && n!=4)
        {
            n=sumofsqr(n);
        }
        if(n==1)
        {
            System.out.println(temp+"is a happy number");
        }
        else{
            System.out.println(temp+"is not a happy number");
        }
        in.close();
    }
    public static int sumofsqr(int n)
    {
        int sum=0;
        while(n>0)
        {
            int digits=n%10;
            sum+=digits*digits;
            n=n/10;
        }
        return sum;
    }

    
}
