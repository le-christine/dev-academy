import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateTest {

    Calculate calc = new Calculate();
    int sum = calc.sum(2,5);
    int testSum = 7;
    @Test
    public void sum() {
        assertEquals(testSum, sum);
    }
}