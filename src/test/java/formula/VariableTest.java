package formula;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;
import static org.junit.jupiter.api.Assertions.*;

class VariableTest {

  private static final Double EPSILON = 1e-6;

  @Test
  void testEval() {
    Formula f = new Variable();
    assertThat(f.eval(0)).isCloseTo(0, within(EPSILON));
    assertThat(f.eval(10)).isCloseTo(10, within(EPSILON));
    assertThat(f.eval(-Math.PI)).isCloseTo(-Math.PI, within(EPSILON));
  }

  @Test
  void testDerivative() {
    Formula f = new Variable();
    assertThat(f.derivative().eval(0)).isCloseTo(1, within(EPSILON));
    assertThat(f.derivative().eval(10)).isCloseTo(1, within(EPSILON));
    assertThat(f.derivative().eval(-Math.PI)).isCloseTo(1, within(EPSILON));
    assertThat(f.derivative()).isEqualTo(new Constant(1));
  }

  @Test
  void testToString() {
    Formula f = new Variable();
    assertThat(f.toString()).isEqualTo("x");
  }

  @Test
  void testEquals() {
    Formula f = new Variable();
    Formula g = new Variable();
    Formula h = new Constant(1);
    assertEquals(f, g);
    assertNotEquals(f, h);
  }
}