package numbers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Numbers1Test {
    Numbers1 n;

    @Before
    public void setUp() throws Exception {
        n = new Numbers1();
    }

    @Test
    //@DisplayName("1 should be odd, 2 should be even")
    public void isOdd() {
        assertTrue(n.isOdd(1));
        assertFalse(n.isOdd(2));
    }

    @Test
    public void isBuzz() {
        assertTrue(n.isBuzz(9223372036854775807L));
        assertFalse(n.isBuzz(101));
    }
}
