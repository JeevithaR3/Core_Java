
class happy
{
    public static void main(String args[])
    {
        
        int n=19;
        int sum=0;
        int product=0;
        int temp1=n%10; //last digit
        int temp2=n/10; //first digit
        sum=temp1+temp2;
        product=temp1*temp2;
        if((sum+product)==n)
        {
            System.out.println("Happy number");

        }
        else{
            System.out.println("not a Happy number");
        }

    }
}