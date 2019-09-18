public class ArgsExample {
    // The program arguments have been configured
    public static void main(String args[]) {
        for (int x = 0; x<args.length; x++) {
            System.out.println(args[x] + " " + args[x].getClass());
        }
    }
}
