public class IIBExample {
    int x;

    {
        System.out.println("IIB block executed");
    x=10;
   }
   public static void main(String args[])
   {
         IIBExample obj=new IIBExample();
            System.out.println("Value of x: "+obj.x);
         
   }
}
