package Creational.abstractfactory;

public class Main {
    public static void main (String args[]) {
        CarFactory.buildcar(Location.UK,CarType.Macro);
        CarFactory.buildcar(Location.US, CarType.Mini);
    }
}
