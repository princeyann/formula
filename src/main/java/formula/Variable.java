package formula;

public final class Variable implements Formula {

  @Override
  public double eval(double xValue) {

    return xValue;
  }

  @Override
  public Formula derivative() {

    return new Constant(1);
  }

  @Override
  public String toString() {

    return "x";
  }

  @Override
  public boolean equals(Object obj) {
    return obj instanceof Variable;
  }
}
