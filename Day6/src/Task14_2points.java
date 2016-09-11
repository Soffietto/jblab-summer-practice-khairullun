import java.util.Scanner;

public class Task14_2points {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double result = 0;
        for (int i = 1; i < n + 1; i++) {
            result += Math.pow(factorial(i - 1), 2) / factorial(2 * i);
        }
        System.out.println(result);
    }

    private static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
