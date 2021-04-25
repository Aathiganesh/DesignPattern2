package Behavioral.TemplateMethod;

public abstract class Order {
    abstract void doselect();
    abstract void dopayment();
    abstract void dodelievery();
    public void processorder() {
        doselect();
        dopayment();
        dodelievery();
    }
}

class Netorder extends Order {

    @Override
    void doselect() {
        System.out.println("net order");
    }

    @Override
    void dopayment() {
        System.out.println("online payment");
    }

    @Override
    void dodelievery() {
        System.out.println("through courier");
    }
}
class Storeorder extends Order {

    @Override
    void doselect() {
        System.out.println("store order");
    }

    @Override
    void dopayment() {
        System.out.println("cash payment");
    }

    @Override
    void dodelievery() {
        System.out.println("counter delievery");
    }
}