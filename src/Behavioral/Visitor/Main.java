package Behavioral.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String args[]) {
        ItemElement [] ls = new ItemElement[]{
                new Fruit(10, 5, 1),
                new Fruit(20, 4, 2),
                new Book(100, 3),
                new Book(200, 4),
        };
        calculatePrice(ls);
    }
    public static void calculatePrice(ItemElement[] ls) {
        ShoppingCartVisitor vs = new visitor();
        int price = 0;
        for (ItemElement item : ls) {
            price = price + item.accept(vs);
        }
        System.out.println(price);
    }
}
