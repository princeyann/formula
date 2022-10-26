package formula;


public record Constant(double value) implements Formula {

  @Override
  public double eval(double xValue) {
    // TODO : change the code.
    return 0;
  }

  @Override
  public Formula derivative() {
    // TODO : change the code.
    return this;
  }

  @Override
  public String toString() {
    // TODO : change the code.
    return "toto";
  }


  @Override
  public boolean equals(Object obj) {
    if(obj == null) return false;
    if(!(obj instanceof Constant constant)) return false;
    return Math.abs(this.value - constant.value) < 1e-6;
  }
}
