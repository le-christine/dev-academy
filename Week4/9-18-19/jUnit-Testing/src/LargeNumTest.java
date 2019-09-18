import org.junit.Test;

import static org.junit.Assert.*;

public class LargeNumTest {

    @Test
    public void findMax() {
        assertEquals(5,LargeNum.findMax(new int[] {1,3,5,3,4,2,1}));
        assertEquals(-1, LargeNum.findMax(new int[] {-12,-1,-5,-3}));

    }
}