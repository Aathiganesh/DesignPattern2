package Structural.Bridge;

public class Car extends Vehicle {
    public Car(Workshop ws1, Workshop ws2) {
        super(ws1, ws2);
    }

    @Override
    void produce() {
        System.out.println("Car   ");
        wshp1.work();
        wshp2.work();
    }
}
