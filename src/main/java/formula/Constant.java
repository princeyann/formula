package formula;


public record Constant(double value) implements Formula {

  public Constant(double value) {
    this.value = value;
  }

  @Override
  public double eval(double xValue) {

    return value;
  }

  @Override
  public Formula derivative() {


    return new Constant(0);
  }

  @Override
  public String toString() {


    return value+"" ;
  }


  @Override
  public boolean equals(Object obj) {
    if(obj == null) return false;
    if(!(obj instanceof Constant constant)) return false;
    return Math.abs(this.value - constant.value) < 1e-6;
  }
}
