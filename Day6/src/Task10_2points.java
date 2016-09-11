import java.util.Scanner;

public class Task10_2points {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long result = 1;
        int checker;
        int n = in.nextInt();
        if (n % 2 == 0)
            checker = 2;
        else
            checker = 1;
        while (checker < n) {
            result *= checker;
            checker += 2;
        }
        result *= n;
        System.out.println(result);
    }
}
