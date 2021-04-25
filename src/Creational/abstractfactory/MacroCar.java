package Creational.abstractfactory;

public class MacroCar extends Car {
    MacroCar(Location location) {
        super(CarType.Macro, location);
        construct();
    }

    public void construct() {
        System.out.println("construction started");
    }
}
