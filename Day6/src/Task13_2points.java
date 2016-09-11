import java.util.Scanner;

public class Task13_2points {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        int number;
        double result = x + n;

        for (int i = n - 1; i > 0; i--) {
            result = i + x / result;

        }

        System.out.println(result);


    }
}
