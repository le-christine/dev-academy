import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TestMethodsTest {

    @org.junit.Test
    public void divide152By() {
        assertEquals((152/3), TestMethods.divide152By(3));
        assertEquals((152/43), TestMethods.divide152By(43));
        assertEquals((152/8), TestMethods.divide152By(8));
    }

    @org.junit.Test
    public void thirdAndFirst() {
        assertTrue(TestMethods.thirdAndFirst("billygoat", "LION"));
        assertFalse(TestMethods.thirdAndFirst("drEAMcaTCher","statue"));
        assertFalse(TestMethods.thirdAndFirst("Times","thyme"));
    }

    @org.junit.Test
    public void transmogrifier() {
        assertEquals(((5*4)^3), TestMethods.transmogrifier(5, 4, 3));
        assertEquals(((13*12)^5),TestMethods.transmogrifier(13, 12, 5));
        assertEquals(((42*13)^7), TestMethods.transmogrifier(42, 13, 7));
    }

    @org.junit.Test
    public void reverseString() {
        assertEquals("tac kcalb",TestMethods.reverseString("black cat"));
        assertEquals("noom eht revo depmuj woc eht",TestMethods.reverseString("the cow jumped over the moon"));
        assertEquals("srabeldnah on htiw ekib ym edir nac I",TestMethods.reverseString("I can ride my bike with no handlebars"));
    }

    @org.junit.Test
    public void findLongestWord() {
        assertEquals(10, TestMethods.findLongestWord(new String[]{"Greg", "Aleksandra", "Martha", "Oliwka"}));

    }

    @org.junit.Test
    public void filterLongWords() {
        ArrayList <String> expected = new ArrayList<String>();
        expected.add("hello");
        expected.add("hey");
        expected.add("hola");
        assertEquals(expected, TestMethods.filterLongWords((new String[]{"hi", "hello", "hey", "hola"}), 2));
    }

}