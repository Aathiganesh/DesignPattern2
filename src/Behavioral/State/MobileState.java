package Behavioral.State;

public interface MobileState {
    public void alert();
}

class Silent implements MobileState {
    @Override
    public void alert() {
        System.out.println("silent mode");
    }
}
class Vibrate implements MobileState {

    @Override
    public void alert() {
        System.out.println("Vibrate Mode");
    }
}
