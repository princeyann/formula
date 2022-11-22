package formula;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;
import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {
    private static final Double EPSILON = 1e-6;

    Formula cst2 = new Constant(2);
    Formula x = new Variable();

    Formula add1 = new Addition(cst2, x);


    @Test
    void eval() {
        assertThat(add1.eval(0)).isCloseTo(2,within(EPSILON));
        assertThat(add1.eval(-5)).isCloseTo(-3,within(EPSILON));
        assertThat(add1.eval(5)).isCloseTo(7,within(EPSILON));
    }

    @Test
    void derivative() {
        assertThat(add1.derivative().eval(0)).isCloseTo(1,within(EPSILON));



    }

    @Test
    void testToString() {
        assertThat(add1.toString()).isEqualTo("2.0+x");
;
        Formula add2 = new Addition(new Constant(3), x );
        assertThat(add2.toString()).isEqualTo("3.0+x");

    }
}