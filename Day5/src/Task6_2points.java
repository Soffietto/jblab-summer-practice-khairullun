
public class Task6_2points {
    static final double e = 0.000001;

    public static void main(String[] args) {
        int x = 3;
        int i = 0;
        double y = (double) 1 / Math.pow(x, 2);
        double result = 1;
        while (Math.abs(y) > e) {
            result = result - y;
            x = x + 2;
            if (x % 2 == 0) {
                y = (double) -1 / Math.pow(x, 2);
            } else {
                y = (double) 1 / Math.pow(x, 2);
            }
            i++;
        }
        System.out.println(result);
    }
}

