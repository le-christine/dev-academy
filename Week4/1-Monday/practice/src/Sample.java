public class Sample {
    public static void main(String[] args) {
        int answer = Calc(10,10,'a');
        boolean passOrFail = getScores(3.9, 'a');
        System.out.println(answer);
        System.out.println(passOrFail);
    }

    public static int Calc(int a, int b, char choice) {
        int result = 0;
        switch (choice) {
            case 'a':
                // cannot return a + b from here because the whole method has to return
                result = a+b;
                break;
            case 'm' :
                result = a*b;
                break;
            default:
                System.out.println("Enter the correct option");
        }
        return result;
    }

    public static boolean getScores(double gpa, char letterGrade) {
        return gpa > 3.1 && letterGrade == 'A' || letterGrade == 'a';
    }

}
