public class JavaExceptions {
    public static void main(String args[]) {
        try {
            int a = 30;
            int b = 0;
            int c = a/b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println(e.getCause());
            System.out.println("Cannot divide by 0");
        }
    }
}

