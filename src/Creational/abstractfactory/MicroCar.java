package Creational.abstractfactory;

public class MicroCar extends Car {
    MicroCar(Location location) {
        super(CarType.Micro, location);
        construct();
    }

    public void construct() {
        System.out.println("construction started");
    }
}
