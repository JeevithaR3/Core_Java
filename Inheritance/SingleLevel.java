package Inheritance;

public class SingleLevel extends A
{
   public static void displayC()
   {
	   System.out.println("In the Child class"); 
   }
   public static void main(String args[])
   {
	   @SuppressWarnings("unused")
	SingleLevel obj=new SingleLevel();
	   A.displayP();
	   SingleLevel.displayC();
	   
   }
   
}
class A 
{
	public static void displayP()
	   {
		   System.out.println("In the Parent class"); 
	   }
	
}