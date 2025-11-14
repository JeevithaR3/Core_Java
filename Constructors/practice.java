
package Constructors;
public class practice
{
	String name;
	int runs;
	practice()
	{
		System.out.println("Default constructor called");
		name="Unknown";
		runs=0;
	}
	practice(String name,int runs)
	{
		this(); //calling default constructor
		
		this.name=name;
		this.runs=runs;
		System.out.println("Parameterized constructor called");
	}
	public void display()
	{
		System.out.println("Name: "+name+" ,Runs: "+runs);
	}
	public static void main(String[] args) 
	{
		practice s1=new practice();
		practice s2=new practice("Virat",60);
		s1.display();
		s2.display();
	}

}