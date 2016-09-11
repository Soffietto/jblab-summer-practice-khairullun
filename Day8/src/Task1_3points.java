import java.util.Scanner;

public class Task1_3points {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();

        while (1 == 1) {
            if (Math.max(x, y) % Math.min(x, y) == 0) {
                System.out.println(Math.min(x, y));
                break;
            } else {
                if (x > y)
                    x = Math.max(x, y) % Math.min(x, y);
                else
                    y = Math.max(x, y) % Math.min(x, y);
            }
        }
    }
}
