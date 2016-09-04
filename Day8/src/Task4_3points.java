
public class Task4_3points {
    public static void main(String[] args) {
        String min = args[0];
        String max = args[0];

        for (int i = 1; i < args.length; i++) {
            if (Task3_3points.compare(args[i], min) == 1)
                min = args[i];
            if (Task3_3points.compare(max, args[i]) == 1)
                max = args[i];
        }
        System.out.println(min);
        System.out.println(max);
    }

}
