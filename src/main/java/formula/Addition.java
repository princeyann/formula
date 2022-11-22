package formula;

public final class Addition implements Formula {
    private final Formula formule1;
    private final Formula formule2;

    public Addition(Formula formule1, Formula formule2) {

        this.formule1 = formule1;
        this.formule2 = formule2;
    }


    @Override
    public double eval(double xValue) {
        return formule1.eval(xValue)+formule2.eval(xValue);
    }

    @Override
    public Formula derivative() {

        return new Addition(formule1.derivative(),formule2.derivative());
    }

    @Override
    public String toString() {
        return formule1+""+"+"+formule2+"";
    }
}
