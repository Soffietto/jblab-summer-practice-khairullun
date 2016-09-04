import java.util.Scanner;

public class Task16_2points {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double result = 1;
        double exact = 1;
        final double e = 0.000001;
        for (int i = 1; exact > e; i++) {
            exact = Math.pow(x, 2 * i) * doubleFactorial(2 * i - 1) / doubleFactorial(2 * i);
            result += exact;
        }
        System.out.println(result);
    }

    private static int doubleFactorial(int a) {
        int result = 1;
        if (a % 2 == 0) {
            for (int i = 2; i < a; i += 2) {
                result *= i;
            }
        } else {
            for (int i = 1; i < a; i += 2) {
                result *= i;
            }
        }
        return result * a;
    }
}
