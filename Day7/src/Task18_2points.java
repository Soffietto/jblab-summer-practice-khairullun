import java.util.Scanner;

public class Task18_2points {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] mass = new int[n];
        int summ = 0;
        for (int i = 0; i < n; i++) {
            mass[i] = in.nextInt();
            summ += mass[i];
        }
        System.out.println((double) (summ / n));
    }
}
