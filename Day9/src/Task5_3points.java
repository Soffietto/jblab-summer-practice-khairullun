import java.util.Arrays;
import java.util.Scanner;

public class Task5_3points {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] mass = new String[n];
        for (int i = 0; i < n; i++) {
            mass[i] = in.next();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (compare(mass[i], mass[j]) == -1) {
                    String someString = mass[i];
                    mass[i] = mass[j];
                    mass[j] = someString;
                }
            }

        }
        System.out.println(Arrays.toString(mass));
    }

    public static int compare(String a, String b) {
        for (int i = 0; i < a.length(); i++) {
            if (Character.getNumericValue(a.charAt(i)) < Character.getNumericValue(b.charAt(i))) {
                return 1;
            } else if (Character.getNumericValue(a.charAt(i)) > Character.getNumericValue(b.charAt(i))) {
                return -1;
            }
        }
        return 0;
    }
}
