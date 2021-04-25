package Creational.abstractfactory;

public class MiniCar extends Car {
    MiniCar(Location location) {
        super(CarType.Mini, location);
        construct();
    }

    public void construct() {
        System.out.println("construction started");
    }
}
