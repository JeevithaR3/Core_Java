package Inheritance;
class Aa
{
	public static void displayP()
   {
	   System.out.println("In the Parent class"); 
   }
}
class B extends Aa
{
	public static void displayCP()
   {
	   System.out.println("In the 1st child class class"); 
   }
}

public class MultiLevel extends B
{
	public static  void displayC()
	{
	   System.out.println("In the Child class"); 
	}
	public static void main(String args[])
	{
	   @SuppressWarnings("unused")
	MultiLevel obj=new MultiLevel();
	   Aa.displayP();
	   B.displayCP(); 
	   MultiLevel.displayC(); 
	   
	}
	   
}