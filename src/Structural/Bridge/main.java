package Structural.Bridge;

public class main {
    public static void main(String args[]) {
        Car car = new Car(new Assemble(), new Produce());
        Bike bike = new Bike(new Assemble(), new Produce());
        car.produce();
        bike.produce();
    }
}
