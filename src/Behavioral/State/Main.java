package Behavioral.State;

public class Main {
    public static void main (String args[]) {
        AlertStateContext as = new AlertStateContext();
        as.printstate();
        as.SetAlertState(new Silent());
        as.printstate();
    }
}
