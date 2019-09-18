 import java.lang.Character;
 import java.util.ArrayList;

 public class TestMethods {
        public static void main(String[] args) {
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

     /* bonus */

     /**
      * Takes an array of words and returns the length of the longest one
      * @param args
      * @return length of longest element in array
      */

     public static int findLongestWord(String[] args) {
         int maxLength = args[0].length();

         for (int i = 0; i < args.length; i++) {
             if (args[i].length() > maxLength) {
                 maxLength = args[i].length();
             }
         }
         return maxLength;
     }

     /**
      * Takes an array of words and a number i
      * @param args
      * @param lengthFilter
      * @return Returns array of words that are longer than i characters
      */

     public static ArrayList<String> filterLongWords(String[] args, int lengthFilter) {
         ArrayList<String> filteredWords = new ArrayList<String>();

         for (int i = 0; i < args.length; i++) {
             if (args[i].length() > lengthFilter) {
                 filteredWords.add(args[i]);
             }

         }
         return filteredWords;

     }
 }


