import java.util.Scanner;

public class Task1_2points {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] mas = new int[2 * n];
        boolean result = true;

        for (int i = 0; i < n; i++) {
            mas[i] = in.nextInt();
        }

        for (int i = 0; i < n - 5; i = i + 2) {
            if (!((mas[i + 5] - mas[i + 1]) / (mas[i + 3] - mas[i + 1]) == (mas[i + 4] - mas[i]) / (mas[i + 2] - mas[i]))) {
                result = false;
            }
        }
        if (result) {
            System.out.println("Лежат");
        } else {
            System.out.println("Не лежат");
        }
    }
}
