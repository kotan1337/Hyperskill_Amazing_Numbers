package numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Numbers1Test {
    Numbers1 n = new Numbers1();

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
}
