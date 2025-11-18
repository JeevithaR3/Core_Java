package Polymorphism;

public class Overloading 
{
	public void sum()
	{
		int a=10;
		int b=20;
		System.out.println("Sum is:"+(a+b));
	}
	public void sum(int a,int b)
	{
		System.out.println("Sum is:"+(a+b));
	}
	public void sum(double a,double b)
	{
		System.out.println("Sum is:"+(a+b));
	}
	public static void main(String args[])
	{
		Overloading obj=new Overloading();
		obj.sum();
		obj.sum(15,80);
		obj.sum(3.14,9.81);
		
	}
}