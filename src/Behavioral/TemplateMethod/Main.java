package Behavioral.TemplateMethod;

public class Main {
    public static void main (String args[]) {
        Order or = new Netorder();
        or.processorder();
        Order or1 = new Storeorder();
        or1.processorder();
    }
}
