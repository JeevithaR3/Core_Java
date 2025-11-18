package Inheritance;

interface car {
    void DisplayA();
}

interface truck {
    void DisplayB();
}
class Vehicle 
{
	void mode()
	{
		System.out.println("Road Ways");
	}
}
public class Multiple extends Vehicle implements car, truck {
    public void DisplayA() {
        System.out.println("Inside interface car");
    }

    public void DisplayB() {
        System.out.println("Inside interface truck");
    }

    public static void main(String args[]) {
    	Multiple obj = new Multiple();
        obj.DisplayA();
        obj.DisplayB();
        obj.mode();
    }
}