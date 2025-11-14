//Move all zeros at the end without changing the order
//eg :[5,0,1,3,0,2]
//output :[5,1,3,2,0,0]

package Array;
import java.util.*;
public class move_zeros {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                arr[count]=arr[i];
                count++;
            }
        }
        while(count<n)
        {
            arr[count]=0;
            count++;
        }
        System.out.println("Array after moving zeros to the end:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        in.close();
    }
    
}
