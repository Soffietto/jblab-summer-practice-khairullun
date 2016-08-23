import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] mass = new int[n];
        mass[0] = in.nextInt();
        int min = mass[0];
        for (int i = 1; i < n; i++) {
            mass[i] = in.nextInt();
            if (mass[i] < min)
                min = mass[i];
        }
        System.out.println(min);
    }
}

