public class StringTest {
    public static void main(String args[]) {
        try {
            String a = "This is like chipper.";
            char c = a.charAt(34);
        } catch (StringIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
