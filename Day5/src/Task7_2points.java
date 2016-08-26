import java.util.Scanner;

public class Task7_2points {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int summ = 0;

        for (int i = 0; i < m; i++) {
            int mult = 1;
            for (int j = 0; j < n; j++) {
                mult = mult * (i + j) / (i * j);
            }
            summ = summ + mult;
        }
        System.out.println(summ);
    }
}
