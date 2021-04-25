package Behavioral.ChainOfResponsibility;

public class Chain {
    public Processor chain;
    public Chain () {
        chain = new PositiveProcessor(new NegativeProcessor(null));
    }
    public void process(Number request) {
        chain.process(request);
    }
}
