import java.util.Scanner;

public class Task6_3points {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        double result = 1;
        double summ = 0;
        double mult = 1;

        for (int i = 1; i < l + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                for (int k = 1; k < n + 1; k++) {
                    mult = mult * ((Math.pow(Math.E, i * j * k)) / (Math.cos(i) + Math.sin(j) + Math.tan(k)));
                }
                summ += mult;
            }
            result *= summ;
        }
        System.out.println(result);
    }
}
