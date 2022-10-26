package formula;

public final class Variable implements Formula {

  @Override
  public double eval(double xValue) {
    // TODO
    return 0;
  }

  @Override
  public Formula derivative() {
    // TODO
    return this;
  }

  @Override
  public String toString() {
    // TODO
    return "toto";
  }

  @Override
  public boolean equals(Object obj) {
    return obj instanceof Variable;
  }
}
