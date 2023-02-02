package numbers;

import org.junit.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Numbers4Test {
    Numbers4 n;

    @Before
    public void setUp() throws Exception {
        n = new Numbers4();
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

    @Test
    public void isPalindromic() {
        assertTrue(n.isPalindromic(1));
        assertFalse(n.isPalindromic(12));
        assertTrue(n.isPalindromic(121));
        assertTrue(n.isPalindromic(100000000000001L));
        assertTrue(n.isPalindromic(1234567890987654321L));
    }

    @Test
    public void isGapful() {
        assertTrue(n.isGapful(132));
        assertFalse(n.isGapful(12));
        assertFalse(n.isGapful(1));
        assertTrue(n.isGapful(7881));
    }
}
