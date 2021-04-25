package Structural.Bridge;

public class Bike extends Vehicle {
    public Bike(Workshop ws1, Workshop ws2) {
        super(ws1, ws2);
    }

    @Override
    void produce() {
        System.out.println("Bike   ");
        wshp1.work();
        wshp2.work();
    }
}
