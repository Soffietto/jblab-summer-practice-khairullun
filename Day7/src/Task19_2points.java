import java.util.Arrays;
import java.util.Scanner;

public class Task19_2points {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] mass = new int[n];
        mass[0] = in.nextInt();
        int max = mass[0];
        int min = mass[0];
        int maxPos = 0;
        int minPos = 0;
        int someInt=0;

        for (int i = 1; i < n; i++) {
            mass[i] = in.nextInt();
            if (mass[i] > max) {
                max = mass[i];
                maxPos = i;
            }
            if (mass[i] < min) {
                min = mass[i];
                minPos = i;
            }
        }
        someInt = mass[maxPos];
        mass[maxPos] = mass[minPos];
        mass[minPos] = someInt;
        System.out.println(Arrays.toString(mass));
    }
}
