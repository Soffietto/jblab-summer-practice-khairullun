import java.util.Scanner;

public class Task2_3points {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int result = 0;
        int number = 1;
        if (s.charAt(0) != '-') {
            for (int i = s.length() - 1; i >= 0; i--) {
                result += Character.getNumericValue(s.charAt(i)) * number;
                number *= 10;
            }
        } else {
            for (int i = s.length() - 1; i > 0; i--) {
                result -= Character.getNumericValue(s.charAt(i)) * number;
                number *= 10;
            }
        }
        System.out.println(result);
    }
}
