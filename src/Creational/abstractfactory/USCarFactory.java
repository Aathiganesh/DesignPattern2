package Creational.abstractfactory;

public class USCarFactory {

    public Car USCarFactorymethod (CarType carType) {
        return buildcar(carType);
    }
    public Car buildcar (CarType carType) {
        Car car = null;
        switch (carType) {
            case Macro:
                car = new MacroCar(Location.US);
                break;
            case Micro:
                car = new MicroCar(Location.US);
                break;
            case Mini:
                car = new MiniCar(Location.US);
                break;
        }
        return car;
    }
}
