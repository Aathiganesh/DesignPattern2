package Behavioral.Interpreter;

public class Main {
    public static void main (String args[]) {
        Expression exp1 = new terExp("aathi");
        Expression exp2 = new terExp("ganesh");
        Expression orexp = new orExp(exp1, exp2);

        Expression exp3 = new terExp("commited");
        Expression exp4 = new terExp("rajaed");
        Expression andexp = new andExp(exp3, exp4);

        System.out.println(orexp.interpreter("aathi"));
        System.out.println(orexp.interpreter("ganesh"));
        System.out.println(andexp.interpreter("ed"));
        System.out.println(andexp.interpreter("ganesh"));
    }
}
