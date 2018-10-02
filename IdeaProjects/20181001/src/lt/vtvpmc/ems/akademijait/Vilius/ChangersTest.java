package lt.vtvpmc.ems.akademijait.Vilius;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChangersTest {

    @Test
    void twoNumbersChange() {
        assertEquals(20, Changers.changeTwoNumbers(10, 20));
    }

    @Test
    void twoNumbersChangeVersionTwo() {
        assertEquals(20, Changers.changeTwoNumbersVersionTwo(10, 20));
    }

    @Test
    void twoNumbersChangeVersionThree() {
        assertEquals(20, Changers.changeTwoNumbersVersionThree(10, 20));
    }
}