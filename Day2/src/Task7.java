import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double result = Math.pow(x, 5) - 4 * Math.pow(x, 3) + 2 * Math.pow(x, 2) + 10;
        System.out.println(result);
    }
}
