package Polymorphism;
class Employee
{
	String name;
	Employee(String name)
	{
		this.name=name;
	}
	void showEmployee()
	{
		System.out.println("Employee: "+name);
	}
}
class Project
{
	String title;
	Project(String title)
	{
		this.title=title;
	}
	void showProject()
	{
		System.out.println("Project: "+title);
	}
}
public class Association 
{
	public static void main(String args[])
	{
		Employee e=new Employee("Rohit");
		Project p=new Project("Ai Development");
		e.showEmployee();
		p.showProject();
		
		System.out.println("Association:Employee is working on Project");
	}
}