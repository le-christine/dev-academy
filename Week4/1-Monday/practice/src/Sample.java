public class Sample {
    public static void main(String[] args) {
        /*
         Fizz buzz is a game about division.
         Create a program that will iterate through numbers 1 to 101, and log each number in the console.

        If the number is divisible by three, the word fizz should be logged instead of logging the number itself.
        If the number is divisible by five, the word buzz should be logged.
        If the number is divisible by both three and five, the word fizzbuzz should be logged.
         */

        for (int i = 1; i < 102; i++ ) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0 && i % 3 != 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
