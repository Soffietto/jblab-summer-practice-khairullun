public class Task1 {

    static final int radius = 3;

    public static void main(String[] args) {
        double V = (double) 4 / 3 * Math.PI * Math.pow(radius, 3);
        double S = 4 * Math.PI * Math.pow(radius, 2);
        System.out.println(V);
        System.out.println(S);
    }
}