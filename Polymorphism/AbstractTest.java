package Polymorphism;

abstract class Shape

{  abstract void draw();



	void DisplayInfo()

	{

		System.out.println("This is a shape");

	}

}

class Circle extends Shape

{

	@Override

	void draw()

	{

		System.out.println("Drawing a circle");

	}

}

public class AbstractTest 

{

	public static void main(String args[])

	{

		Shape s=new Circle();

		s.draw();

		s.DisplayInfo();

	}

}