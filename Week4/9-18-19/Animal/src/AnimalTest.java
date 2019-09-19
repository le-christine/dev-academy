import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AnimalTest {
    // initialize the animal before tests so it's accessible to all
    private Animal zebra;

    @Before
    public void animalObjects() {
        zebra = new Animal(4, 40, false, "Zebra");
    }

    @Test
    public void setNumLegs() {
        zebra.setNumLegs(5);
        Assert.assertEquals(5, zebra.getNumLegs());
    }

    @org.junit.Test
    public void getNumLegs() {
        Assert.assertEquals(4, zebra.getNumLegs());
    }

    @org.junit.Test
    public void setEndangered() {
        zebra.setEndangered(true);
        Assert.assertTrue(zebra.getEndangered());
    }

    @org.junit.Test
    public void getEndangered() {
        Assert.assertFalse(zebra.getEndangered());
    }


    @org.junit.Test
    public void setTopSpeed() {
        zebra.setTopSpeed(100);
        Assert.assertEquals(100, zebra.getTopSpeed());
    }

    @org.junit.Test
    public void getTopSpeed() {
        Assert.assertEquals(40, zebra.getTopSpeed());
    }

    @org.junit.Test
    public void setName() {
        zebra.setName("Marty");
        Assert.assertEquals("Marty", zebra.getName());
    }

    @org.junit.Test
    public void getName() {
        Assert.assertEquals("Zebra", zebra.getName());
    }

    @org.junit.Test
    public void introduce() {
        Assert.assertEquals("The Zebra has 4 legs and a top speed of 40 mph.", zebra.introduce());
    }
}