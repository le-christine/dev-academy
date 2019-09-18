import static org.junit.Assert.*;

public class StudentTest {

    @org.junit.Test
    public void getFullname() {
        // constructor - create a new Student Object which we can initialize with values
        Student student = new Student("Leslie", "Knope",'A');
        String expected = "Leslie Knope";
        String actual = student.getFullname();
        // Make an assertion
        assertEquals(expected,actual);
    }

    @org.junit.Test
    public void getGrade() {
        Student mike = new Student("Leslie", "Knope", 'C');
        char expected = 'C';
        char actual = mike.getGrade();
        assertEquals(expected,actual);
    }
}