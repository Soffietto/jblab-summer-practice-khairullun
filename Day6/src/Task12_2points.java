import java.util.Scanner;

public class Task12_2points {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        int value = x + 1;
        int result = x + 1;

        for (int i = 2; i < n + 1; i++) {
            value = value * (x + i);
            result += value;
        }

        System.out.println(result);

    }
}
