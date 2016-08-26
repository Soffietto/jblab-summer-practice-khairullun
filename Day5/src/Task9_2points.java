import java.util.Scanner;

public class Task9_2points {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        System.out.println(stringEquals(str1, str2));
    }

    private static boolean stringEquals(String a, String b) {
        boolean result = true;
        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    result = false;
                }
            }
            return result;
        } else {
            return false;
        }
    }
}
