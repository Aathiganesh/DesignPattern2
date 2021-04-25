package Behavioral.NullObject;

public class Main {
    public static void main (String args[]) {
        Employee emp = new Coder("aathi");
        System.out.println(emp.getName());

        Employee emp2 = new Empty();
        System.out.println(emp2.getName());
    }
}
