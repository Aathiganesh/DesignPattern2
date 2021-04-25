package Behavioral.NullObject;

public abstract class Employee {
    protected String name;
    public abstract String getName ();
    public abstract boolean isnull();
}

class Coder extends Employee {

    public Coder (String st) {
        this.name = st;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isnull() {
        return false;
    }
}
class Empty extends Employee {

    @Override
    public String getName() {
        return "Not Available";
    }

    @Override
    public boolean isnull() {
        return true;
    }
}
