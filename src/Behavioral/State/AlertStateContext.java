package Behavioral.State;

public class AlertStateContext {
    private MobileState mbs;

    public AlertStateContext () {
        this.mbs = new Vibrate();
    }
    public void SetAlertState (MobileState s) {
        this.mbs = s;
    }
    public void printstate () {
        mbs.alert();
    }
}
