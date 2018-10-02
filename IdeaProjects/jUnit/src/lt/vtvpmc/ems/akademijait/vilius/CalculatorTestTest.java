package lt.vtvpmc.ems.akademijait.vilius;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTestTest {
    @Test
    void addTwoZeros(){
        assertEquals(0, CalculatorTest.add(0.0));
    }

}