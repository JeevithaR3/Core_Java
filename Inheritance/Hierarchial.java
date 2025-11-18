package Inheritance;

class SuperHero {

    void Assemble() {

        System.out.println("Avengers Assemble");

    }

}

class IronMan extends SuperHero {

    void suitup() {

        System.out.println("Iron Man is suiting up");

    }

}

class CaptainAmerica extends SuperHero {

    void shield() {

        System.out.println("Steve Rogers throws his shield");

    }

}





public class Hierarchial{

    public static void main(String[] args) 

    {

    	IronMan obj=new IronMan();

    	obj.Assemble();

    	obj.suitup();

    }

}