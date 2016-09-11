import java.util.Scanner;

public class Task17_2points {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] mass = new int[n];
        mass[0] = in.nextInt();
        int max = mass[0];
        int min = mass[0];
        int maxresult = 0;
        int minresult = 0;

        for (int i = 1; i < n; i++) {
            mass[i] = in.nextInt();
            if (mass[i] > max)
                max = mass[i];
            if (mass[i] < min)
                min = mass[i];
        }

        for (int i = 0; i < n; i++) {
            if (mass[i] == max)
                maxresult++;
            if (mass[i] == min)
                minresult++;
        }

        System.out.println(maxresult);
        System.out.println(minresult);
    }
}

