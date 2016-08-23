public class Task14 {

    public static void main(String[] args) {
        int[][] numbers = new int[10][10];
        for (int i = 0; i < 10; i++) {
            numbers[i][0] = numbers[0][i] = i + 1;
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                numbers[i][j] = numbers[i][0] * numbers[j][0];
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
