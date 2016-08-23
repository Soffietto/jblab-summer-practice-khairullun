import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = 0;
        while (n > 0) {
            result = result + n % 10;
            n = n / 10;
            result = result - n % 10;
            n = n / 10;
        }
        System.out.println(result);
    }
}