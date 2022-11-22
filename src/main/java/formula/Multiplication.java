package formula;

public final class Multiplication implements Formula {

    private final Formula f1;
    private final Formula f2;

    public Multiplication(Formula f1, Formula f2) {
        this.f1 = f1;
        this.f2 = f2;
    }


    @Override
    public double eval(double xValue) {
        return f1.eval(xValue)* f2.eval(xValue);
    }

    @Override
    public Formula derivative() {
        return new Multiplication(f1.derivative(),f2.derivative());
    }
    @Override
    public String toString() {
        return f1+""+"*"+f2+"";
    }
}
