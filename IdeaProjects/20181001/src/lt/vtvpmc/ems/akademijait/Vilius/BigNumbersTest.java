package lt.vtvpmc.ems.akademijait.Vilius;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class BigNumbersTest {
    @Test
    void returnBigIntegerNumber (){
        assertEquals(new BigInteger("20"), BigNumbers.addTwoIntegerNumbers(new BigInteger("10"), new BigInteger("10")));
    }

}