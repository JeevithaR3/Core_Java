
package Array;
import java.util.*;

public class maxsum_slidingwindow {
    public static void main(String args[])
    {        
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size fo array");
        int n=in.nextInt();
        System.out.println("Enter the elements of array");
        int arr[]=new int[n];           
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }   
        System.out.println("Enter the size of window");
        int k=in.nextInt(); 
        int sum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<k;i++)        
        {
            sum+=arr[i];
            maxsum=Math.max(maxsum,sum);
        }
        System.out.println("Maximum sum in first window :"+maxsum);
        in.close();
    }
}
