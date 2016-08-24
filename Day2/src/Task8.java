
public class Task8 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] mass1 = new int[n];

        for (int i = 0; i < n; i++) {
            mass1[i] = Integer.parseInt(args[i + 1]);
        }

        int m = Integer.parseInt(args[n + 1]);
        int[] mass2 = new int[m];
        for (int i = 0; i < m; i++) {
            mass2[i] = Integer.parseInt(args[i + n + 2]);
        }

        if (n < m) {
            for (int i = 0; i < n; i++) {
                mass2[i] += mass1[i];
            }
        } else {
            for (int i = 0; i < m; i++) {
                mass1[i] += mass2[i];
            }
        }
    }
}