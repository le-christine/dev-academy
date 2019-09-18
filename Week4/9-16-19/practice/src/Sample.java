import java.lang.Character;

public class Sample {
    public static void main(String[] args) {
        System.out.println(divide152By(3));
        System.out.println(divide152By(43));
        System.out.println(divide152By(8));

        System.out.println(thirdAndFirst("billygoat","LION"));
        System.out.println(thirdAndFirst("drEAMcaTCher","statue"));
        System.out.println(thirdAndFirst("Times","thyme"));

        System.out.println(transmogrifier(5, 4, 3));
        System.out.println(transmogrifier(13, 12, 5));
        System.out.println(transmogrifier(42, 13, 7));

        System.out.println(reverseString("black cat")); // => "tac kcalb"
        System.out.println(reverseString("the cow jumped over the moon")); // => "noom eht revo depmuj woc eht"
        System.out.println(reverseString("I can ride my bike with no handlebars")); // => "srabeldnah on htiw ekib ym edir nac I"
    }


    /*
    Write a method called divide152By().
    It should accept a number as an argument and divide 152 by the given number.
    For example, the divide152By result of 2 — 152/2 — is 76. Your method should return the result.
     */

        public static int divide152By ( int number){
            return 152 / number;
        }

    /*
    Write a method called thirdAndFirst().
    This method accepts two strings and checks if the third letter of the first string is the same as the first letter of the second string.
    It should be case insensitive, meaning thirdAndFirst("Apple","Peon") should return true.
    */

        public static boolean thirdAndFirst(String firstStr, String secondStr) {
            char third = Character.toUpperCase(firstStr.charAt(2));
            char first = Character.toUpperCase(secondStr.charAt(0));
            return third == first;
        }

    /*
    Write a method called transmogrifier().
    This method should accept three arguments, which you can assume will be numbers.
    Your method should return the "transmogrified" result, which is the product of the first two numbers raised to the power of the third number.
    For example, the transmogrified result of 5, 3, and 2 — (5 times 3) to the power of 2 — is 225.
     */

    public static int transmogrifier(int a, int b, int c) {
        int transmogrified = (a*b)^c;
        return transmogrified;
    }

    /*
    Write a method called reverseString().
    This method should take one argument, a String.
    The method should return a String with the order of the words reversed.
    Don't worry about punctuation.
     */

    public static String reverseString(String toBeReversed) {
        String reverse = "";
        for (int i = toBeReversed.length()-1; i >= 0; i-- ) {
            reverse += toBeReversed.charAt(i);
        }
        return reverse;
    }
}



