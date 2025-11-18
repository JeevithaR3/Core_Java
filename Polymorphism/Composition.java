package Polymorphism;

class Engine {
    void start() {
        System.out.println("Engine started");
    }
}

class VehicleCar {       // fixed name
    private Engine engine;

    VehicleCar() {
        engine = new Engine();
    }

    void drive() {
        engine.start();
        System.out.println("VehicleCar is driving....");
    }
}

public class Composition {

    public static void main(String[] args) {
        VehicleCar car = new VehicleCar();   // fixed spelling
        car.drive();
    }
}