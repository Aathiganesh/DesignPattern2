package Creational.abstractfactory;

public class Car {
    public Car (CarType carType, Location location) {
        System.out.println(carType + "builded on " + location + "\n");
    }
}
