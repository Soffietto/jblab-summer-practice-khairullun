import java.util.Scanner;

public class Task15_2points {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double result = 1;
        double exact = 1;
        final double e = 0.000001;
        for (int i = 1; exact > e; i++) {
            exact = Math.pow(-1, i) * Math.pow(x, 2 * i) / factorial(2 * i);
            result += exact;
        }
        System.out.println(result);
    }

    private static int factorial(int a) {
        int result = 1;
        for (int i = 1; i < a + 1; i++) {
            result *= i;
        }
        return result;
    }
}
