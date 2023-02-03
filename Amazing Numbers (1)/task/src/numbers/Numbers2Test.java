package numbers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Numbers2Test {
    Numbers2 n;

    @Before
    public void setUp() throws Exception {
        n = new Numbers2();
    }

    @Test
    public void isOdd() {
        assertTrue(n.isOdd(1));
        assertFalse(n.isOdd(2));
    }

    @Test
    public void isBuzz() {
        assertTrue(n.isBuzz(9223372036854775807L));
        assertFalse(n.isBuzz(101));
    }

    @Test
    public void isDuck() {
        assertTrue(n.isDuck(9223372036854775807L));
        assertFalse(n.isDuck(111));
    }
}