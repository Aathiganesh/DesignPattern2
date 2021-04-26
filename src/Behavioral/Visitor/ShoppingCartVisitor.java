package Behavioral.Visitor;

public interface ShoppingCartVisitor {
    public int visit (Fruit fr);
    public int visit (Book bk);
}

class visitor implements ShoppingCartVisitor {

    @Override
    public int visit(Fruit fr) {
        System.out.println(fr.getIsbn() + "    " + fr.getPricekg() + "    " + fr.getTotalkg());
        return fr.getPricekg() * fr.getTotalkg();
    }

    @Override
    public int visit(Book bk) {
        System.out.println(bk.getIsbnnumber() + "   " + bk.getPrice());
        return bk.getPrice();
    }
}
