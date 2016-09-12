import java.util.HashMap;
import java.util.Scanner;

public class Task8_3points {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] mass = new int[n];
        int result = 1;

        for (int i = 0; i < n; i++) {
            mass[i] = in.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(mass[i])) {
                map.put(mass[i], 1);
            } else {
                map.put(mass[i], map.get(mass[i]) + 1);
                if (map.get(mass[i]) > result)
                    result = map.get(mass[i]);
            }
        }
        System.out.println(result);

    }
}
