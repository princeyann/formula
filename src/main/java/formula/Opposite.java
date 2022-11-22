package formula;

public final class Opposite implements Formula {
    private final Formula f1;

    public Opposite(Formula f1) {
        this.f1 = f1;
    }

    @Override
    public double eval(double xValue) {
        return -f1.eval(xValue);
    }

    @Override
    public Formula derivative() {
        return new Opposite(f1.derivative());
    }
}
