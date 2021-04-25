package Behavioral.Command;

public class Light {
    public void lightOn() {
        System.out.println("lights on ");
    }
    public void fanon() {
        System.out.println("fan also on ");
    }
    public void fanoff() {
        System.out.println("fan also off ");
    }
    public void lightOff() {
        System.out.println("lights off ");
    }
}

class LightOn implements Command {
    Light lt;
    public LightOn(Light light) {
        this.lt = light;
    }
    @Override
    public void execute() {
        lt.lightOn();
        lt.fanon();
    }
}

class LightOff implements Command {
    Light lt;
    public LightOff (Light light) {
        this.lt = light;
    }
    @Override
    public void execute() {
        lt.lightOff();
        lt.fanoff();
    }
}
