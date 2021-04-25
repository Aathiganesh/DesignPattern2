package Behavioral.Interpreter;

public interface Expression {
    public boolean interpreter(String str);
}

class terExp implements Expression {
    String data;

    public terExp (String dt ) {
        this.data = dt;
    }

    @Override
    public boolean interpreter(String str) {
        if (this.data.contains(str)) {
            return true;
        }
        else {
            return false;
        }
    }

}

class andExp implements Expression {
    Expression er1, er2;

    public andExp (Expression exp1, Expression exp2) {
        this.er1 = exp1;
        this.er2 = exp2;
    }

    @Override
    public boolean interpreter(String str) {
        return er1.interpreter(str) && er2.interpreter(str);
    }
}

class orExp implements  Expression {
    Expression er1, er2;

    public orExp (Expression exp1, Expression exp2) {
        this.er1 = exp1;
        this.er2 = exp2;
    }

    @Override
    public boolean interpreter(String str) {
        return er1.interpreter(str) || er2.interpreter(str);
    }
}