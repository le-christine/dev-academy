public class Calculator {
    /*
    sum
    main
    double first, double second
    return the sum of the first plus second
     */
    public static double Sum(double num1, double num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double mySum = calc.Sum(10.50,5.75);
        System.out.println(mySum);
    }
}
