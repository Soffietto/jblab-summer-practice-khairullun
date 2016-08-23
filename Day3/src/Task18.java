import java.util.Arrays;
import java.util.Scanner;

class Task18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sign = 1;
        boolean pos = true;
        int[] azat = new int[n];
        for (int i = 0; i < n; i++) {
            azat[i] = sign;
            if (pos) {
                sign = (sign + 2) * (-1);
                pos = false;
            } else {
                sign = (sign - 2) * (-1);
                pos = true;
            }
        }
        System.out.println(Arrays.toString(azat));
    }
}
