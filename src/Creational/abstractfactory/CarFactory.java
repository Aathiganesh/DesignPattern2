package Creational.abstractfactory;

public class CarFactory {
    public CarFactory() {

    }
    public static void buildcar (Location location, CarType carType) {
        Car car;
        switch (location) {
            case US:
                USCarFactory usCarFactory = new USCarFactory();
                car = usCarFactory.USCarFactorymethod(carType);
                break;
            case UK:
                UKCarFactory ukCarFactory = new UKCarFactory();
                car = ukCarFactory.UKCarFactorymethod(carType);
                break;
        }
    }
}
