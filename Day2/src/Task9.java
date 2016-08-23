import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        double y;
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        if (x > 2) {
            y = (Math.pow(x, 2) - 1) / (x + 2);
        } else if (x > 0 && x < 2) {
            y = (Math.pow(x, 2) - 1) * (x + 2);
        } else {
            y = Math.pow(x, 2) * (1 + 2 * x);
        }
        System.out.println(y);
    }
}
