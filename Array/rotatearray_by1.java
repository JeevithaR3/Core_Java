package Array;

import java.util.Scanner;

public class rotatearray_by1 {
    public static void main(String args[])
    {
       
        Scanner in=new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int n=in.nextInt();
         int arr[]=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        int last=arr[n-1];
        for(int i=n-1;i>0;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[0]=last;
        System.out.println("Array after rotation:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
        }
        in.close();
    }

    
}
