
public class Task19 {
    public static void main(String[] args) {
        int summ = 0;
        for (int i = 0; i < args.length; i++) {
            if (Integer.parseInt(args[i]) % 3 == 0) {
                summ++;
            }
        }
        System.out.println(summ);
    }
}
