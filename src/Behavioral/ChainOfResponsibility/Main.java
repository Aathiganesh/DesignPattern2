package Behavioral.ChainOfResponsibility;

public class Main {
    public static void main (String args[]) {
        Chain ch = new Chain();
        ch.process(new Number(9));
        ch.process(new Number(-9));
    }
}
