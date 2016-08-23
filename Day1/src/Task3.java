public class Task3 {
    static final double x = 10.0;
    static final double y = 20.0;
    static final double z = 1.0;

    public static void main(String[] args) {
        double result = ((x + y + 2.1) * z / (x - z - 5.6) + y) * y + (z + 1.1) / (z - 2.0);
        System.out.println(result);
    }
}
