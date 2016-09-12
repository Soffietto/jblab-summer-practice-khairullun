import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task7_3points {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] mass = new int[n];
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            mass[i] = in.nextInt();
            set.add(mass[i]);
        }

        System.out.println(set.size());
    }
}
