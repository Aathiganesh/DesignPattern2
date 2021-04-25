package Structural.Bridge;

public abstract class Vehicle {
    protected Workshop wshp1;
    protected Workshop wshp2;

    public Vehicle (Workshop ws1, Workshop ws2) {
        this.wshp1 = ws1;
        this.wshp2 = ws2;
    }
    abstract void produce ();
}
