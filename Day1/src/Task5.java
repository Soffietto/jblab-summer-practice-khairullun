import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean result = false;
        int n = in.nextInt();
        double[] mass = new double[n];
        for (int i = 0; i < n; i++) {
            mass[i] = in.nextDouble();
            if (mass[i] * 1 == 0)
                result = true;
        }
        System.out.println(result);
    }
}
