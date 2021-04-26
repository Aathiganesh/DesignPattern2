package Behavioral.Visitor;

public interface ItemElement {
    public int accept(ShoppingCartVisitor visitor);
}
class Book implements ItemElement {
    private int price;
    private int isbnnumber;

    public Book (int p, int isb) {
        this.price = p;
        this.isbnnumber = isb;
    }

    public int getIsbnnumber() {
        return isbnnumber;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
class Fruit implements ItemElement {
    private int pricekg;
    private int totalkg;
    private int isbn;

    public Fruit (int a, int b, int c) {
        this.pricekg = a;
        this.totalkg = b;
        this.isbn = c;
    }

    public int getIsbn() {
        return isbn;
    }

    public int getPricekg() {
        return pricekg;
    }
    public int getTotalkg() {
        return totalkg;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
