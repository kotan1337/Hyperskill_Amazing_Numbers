package numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Numbers2Test {
    Numbers2 n = new Numbers2();

    @Test
    void isOdd() {
        assertTrue(n.isOdd(1));
        assertFalse(n.isOdd(2));
    }

    @Test
    void isBuzz() {
        assertTrue(n.isBuzz(9223372036854775807L));
        assertFalse(n.isBuzz(101));
    }

    @Test
    void isDuck() {
        assertTrue(n.isDuck(9223372036854775807L));
        assertFalse(n.isDuck(111));
    }
}