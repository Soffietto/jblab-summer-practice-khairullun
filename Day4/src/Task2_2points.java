import java.util.Scanner;

public class Task2_2points {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] mas = new int[n];
        for (int i = 0; i < n; i++) {
            mas[i] = in.nextInt();
        }

        for (int i : mas) {
            switch (mas[i] % 2) {
                case 0:
                    System.out.print("c" + " ");
                    break;
                case 1:
                    System.out.print("n" + " ");
                    break;
            }
        }
    }
}
