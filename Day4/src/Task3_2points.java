import java.util.Scanner;

public class Task3_2points {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] mas = new int[n];
        String positive;
        for (int i = 0; i < n; i++) {
            mas[i] = in.nextInt();
        }

        for (int i : mas) {
            positive = i >= 0 ? "True" : "False";
            switch (positive) {
                case "True":
                    System.out.print("+" + " ");
                    break;
                case "False":
                    System.out.print("-" + " ");
                    break;
            }
        }
    }
}
