package Polymorphism;
class Bank
{
	double getInterestRate()
	{
		return 0.0;
	}
}

class SBI extends Bank
{
	@Override
	double getInterestRate()
	{
		return 5.5;
	}
}
class HDFC extends Bank
{
	@Override
	double getInterestRate()
	{
		return 6.7;
	}
}

public class Overriding 
{
	public static void main(String args[])
	{
		Bank b1=new SBI();
		System.out.println("Sbi interest rate: "+b1.getInterestRate());
		Bank b2=new HDFC();
		System.out.println("HDFC interest rate: "+b2.getInterestRate());
		
	}
}