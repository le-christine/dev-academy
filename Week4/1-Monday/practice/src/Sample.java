public class Sample {
    public static void main(String[] args) {
        String blue = "blue";
//        boolean withSign = (blue == "blue");
//        System.out.println(withSign);

        String bl = "bl";
        String ue = "ue";
        System.out.println(bl+ ue);
        boolean withSign = (bl + ue == blue); //location memory differs, so false
        // boolean withSign = (bl + ue).equals(blue);
        System.out.println(withSign);

//        int x; // declaration
//        x = 100; // initalization
//        System.out.println(x);
    }
}
