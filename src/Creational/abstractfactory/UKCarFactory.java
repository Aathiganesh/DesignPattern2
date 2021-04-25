package Creational.abstractfactory;

public class UKCarFactory {
    public Car UKCarFactorymethod (CarType carType) {
        return buildcar(carType);
    }
    public Car buildcar (CarType carType) {
        Car car = null;
        switch (carType) {
            case Macro:
                car = new MacroCar(Location.UK);
                break;
            case Micro:
                car = new MicroCar(Location.UK);
                break;
            case Mini:
                car = new MiniCar(Location.UK);
                break;
        }
        return car;
    }
}
