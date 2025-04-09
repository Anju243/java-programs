
class Vehicle {
    String brand;

    void start() {
        System.out.println(brand + " is starting...");
    }
}


class Car extends Vehicle {
    int speed;

    void accelerate() {
        System.out.println(brand + " is accelerating at " + speed + " km/h.");
    }
}


public class InheritanceVehicle {
    public static void main(String[] args) {
        Car myCar = new Car(); 
        myCar.brand = "Toyota"; 
        myCar.speed = 100;
        myCar.start(); 
        myCar.accelerate(); 
    }
}

