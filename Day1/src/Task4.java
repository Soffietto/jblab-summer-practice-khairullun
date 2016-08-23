import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double summ = 0;
        double mult = 1;
        double[] mass = new double[n];
        for (int i = 0; i < n; i++) {
            mass[i] = in.nextDouble();
            if (i % 2 != 0)
                summ = summ + mass[i];
            if (mass[i] > 0)
                mult = mult * mass[i];

        }
        System.out.println(summ);
        System.out.println(mult);
    }
}
