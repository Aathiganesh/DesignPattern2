package Structural.Composite;

import java.util.ArrayList;
import java.util.List;

interface ComputerParts {

}

interface Component {
    void showprice ();
}

class leaf implements Component {
    int price;
    String name;

    leaf(int amt, String name) {
        this.price = amt;
        this.name = name;
    }

    @Override
    public void showprice() {
        System.out.println(this.name + this.price);
    }
}

class Composite implements Component {
    List<Component> ls = new ArrayList<Component>();
    String name;
    Composite (String name) {
        this.name = name;
    }

    public void addComponent (Component c) {
        ls.add(c);
    }

    @Override
    public void showprice() {
        System.out.println(this.name);
        for (Component cp: ls) {
            cp.showprice();
        }
    }
}