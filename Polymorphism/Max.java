package Polymorphism;

public class Max
{
	public int max(int a,int b)
	{
		return (a>b)?a:b;
	}
	public double max(double a,double b)
	{
		return (a>b)?a:b;
	}
	public float max(float a,float b)
	{
		return (a>b)?a:b;
	}
	public static void main(String[] args) 
	{
		Max obj=new Max();
		int a=obj.max(10, 20);
		double b=obj.max(10.508, 20.001);
		float c=obj.max(10.5f, 20.9f);
		System.out.print(a+" "+b+" "+c);
	}

}