package Creational.builder;

public class mobile {
    private String modelName;
    private int battery;
    private int amount;
    private String os;
    private String weight;

    public mobile (String name, int bat, int amt, String os, String weight) {
        this.amount = amt;
        this.battery = bat;
        this.os = os;
        this.modelName = name;
        this.weight = weight;
    }
    public String toString () {
        System.out.println(this.amount+this.modelName+this.os + this.weight+this.battery);
        return "";
    }
}
