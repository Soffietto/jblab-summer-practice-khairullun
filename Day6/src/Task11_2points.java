import java.util.Random;
import java.util.Scanner;

public class Task11_2points {
    public static void main(String[] args) {
        Random rn = new Random();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(rn.nextInt(8) - 3 + " ");
        }
    }
}
