package Array;

import java.util.Scanner;

public class hammingweight {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        
        // String binary = "";
        // int temp = n;

        // while (temp > 0) {
        //     int rem = temp % 2;        // remainder when divided by 2
        //     binary = rem + binary;     // add remainder to front of string
        //     temp = temp / 2;           // divide number by 2
        // }

        // System.out.println("Binary of " + n + " = " + binary);
        int count=0;
        int temp1=n;
        while(temp1>0)
        {
            count+=temp1&1;
            temp1>>=1;

        }
        System.out.println("Hamming Weight of " + n + " = " + count);
        in.close();
    }
}
