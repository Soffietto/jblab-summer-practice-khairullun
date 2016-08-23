import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double result = 1;
        for (int k = 0; k < n; k++) {
            result = result * 4 * Math.pow(k, 2) / (4 * Math.pow(k, 2) - 1);
        }
        System.out.println(result);
    }
}
