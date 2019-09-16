public class Sample {
    public static void main(String[] args) {
        String blue = "blue";
//        boolean withSign = (blue == "blue");
//        System.out.println(withSign);

        String bl = "bl";
        String ue = "ue";
        System.out.println(bl+ ue);
        boolean withSign = (bl + ue == blue);
        // boolean withSign = (bl + ue).equals(blue);
        System.out.println(withSign);

    }
}
