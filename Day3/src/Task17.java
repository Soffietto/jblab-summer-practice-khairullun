import java.util.Scanner;


public class Task17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < n; k++) {
                System.out.print("1");
            }
            System.out.println();
        }
    }
}
