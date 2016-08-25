import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] mas1 = new int[n];
        int[] mas2 = new int[n];
        for (int i = 0; i < n; i++) {
            mas1[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            mas2[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            mas1[i] = mas2[mas1[i]];
        }
        for (int x : mas1) {
            System.out.print(x + " ");
        }
    }
}