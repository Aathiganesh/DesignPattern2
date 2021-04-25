package Behavioral.ChainOfResponsibility;

public class Processor {
    private Processor processor;

    public Processor (Processor pr) {
        this.processor = pr;
    }
    public void process (Number request) {
        if (processor != null) {
            processor.process(request);
        }
    }
}

class NegativeProcessor extends Processor {
    public NegativeProcessor(Processor pr) {
        super(pr);
    }
    public void process (Number request) {
        if (request.getNumber() < 0) {
            System.out.println("Negative");
        }
        else {
            super.process(request);
        }
    }
}

class PositiveProcessor extends Processor {
    public PositiveProcessor(Processor pr) {
        super(pr);
    }
    public void process (Number request) {
        if (request.getNumber() > 0) {
            System.out.println("positive");
        }
        else {
            super.process(request);
        }
    }
}
