import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        double y;
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        y = (x > -4) ? (x - 1) / (x + 3) : 2 * x - 5;
        System.out.println(y);
    }
}
