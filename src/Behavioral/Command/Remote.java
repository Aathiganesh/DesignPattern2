package Behavioral.Command;

public class Remote {
    Command cm;
    public Remote (){

    }
    public void setCommand (Command command) {
        this.cm = command;
    }

    public void pressed () {
        this.cm.execute();
    }
}
