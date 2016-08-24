import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Double[] mass = new Double[n];
        int summ = 0;
        int mult = 1;
        for (Double a : mass) {
            a = in.nextDouble();
            if (a % 1 == 0) {
                summ += a;
                mult *= a;
            }
        }
        System.out.println(summ);
        System.out.println(mult);
    }
}
