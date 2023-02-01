package numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Numbers3Test {
    Numbers3 n = new Numbers3();

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

    @Test
    void isPalibdromic() {
        assertTrue(n.isPalindromic(1));
        assertFalse(n.isPalindromic(12));
        assertTrue(n.isPalindromic(121));
        assertTrue(n.isPalindromic(100000000000001L));
        assertTrue(n.isPalindromic(1234567890987654321L));
    }
}
