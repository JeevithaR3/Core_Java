package Array;

public class SlidingWindow 
{
	public static void main(String args[])
	{        
        int[] nums= {1,2,3,4,5,6,7,8};
        int target=11;
        int k=3;  //window size
        int sum=0;
        boolean found=false;
        for(int i=0;i<k;i++)
        	sum+=nums[i];

        if(sum==target)
        	found=true;
        
        for(int i=k;i<nums.length;i++)
        {
        	sum+=nums[i]-nums[i-k];
        	if(sum==target)
        	{
            	found=true;
            	break;
        	}
        	
        }
		
		if(found)
			System.out.println("K subarray with sum "+target+" exists");
		else
			System.out.println("no subarray found with sum "+target+" .");
	}
}