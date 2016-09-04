import java.util.Scanner;

/**
 * Created by Azot- on 26.08.2016.
 */
public class Task3_3points {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        System.out.println(compare(a, b));
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
