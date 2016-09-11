import java.util.Scanner;

public class Task20_2points {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int someint;
        int[] mas = new int[n];

        for (int i = 0; i < n; i++) {
            mas[i] = in.nextInt();
        }

        for (int i = 0; i < n / 2; i++) {
            someint = mas[i];
            mas[i] = mas[n - i - 1];
            mas[n - i - 1] = someint;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}
