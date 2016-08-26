import java.util.Scanner;

public class Task5_2points {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        double y = x > 6 ? (Math.pow(x, 2) - 1) / (3 * x + 5) : Math.pow(x + 1, 3) / (x - 7) + 2;
        System.out.println(y);
    }
}
