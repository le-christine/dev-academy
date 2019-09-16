public class Sample {
    public static void main(String[] args) {
        String food = "apple";

        switch (food) {
            case "apple":
                System.out.println("Apple");
                break;
            case "pear":
                System.out.println("Pear");
                break;
            default:
                System.out.println("Cannot find the food");
        }
    }
}
