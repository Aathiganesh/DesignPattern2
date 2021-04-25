package Creational.builder;

public class MobileBuilder {
    private String modelName;
    private int battery;
    private int amount;
    private String os;
    private String weight;

    public MobileBuilder setmodelName (String name) {
        this.setmodelName(name);
        return this;
    }
    public MobileBuilder setbattery (int battery) {
        this.setbattery(battery);
        return this;
    }
    public MobileBuilder setamount (int amt) {
        this.setamount(amt);
        return this;
    }
    public MobileBuilder setos (String os) {
        this.setos(os);
        return this;
    }
    public MobileBuilder setweight (int wt) {
        this.setweight(wt);
        return this;
    }
    public mobile getmobile (MobileBuilder mb) {
        mobile m = new mobile(mb.modelName, mb.amount, mb.battery, mb.os, mb.weight);
        return m;
    }
}
