public class Task8_2points {
    public static void main(String[] args) {
        char[] string1 = args[0].toCharArray();
        char[] string2 = args[1].toCharArray();
        int checker1 = 0;
        int checker2 = string2.length;

        for (int i = 0; i < string1.length; i++) {
            if (checker1 != checker2)
                for (int j = 0; j < string2.length; j++) {
                    if (string1[i] == string2[j]) {
                        checker1++;
                        i++;
                    } else {
                        checker1 = 0;
                        break;
                    }
                }
        }
        if (checker1 == checker2) {
            System.out.println("Является");
        } else {
            System.out.println("Не является");
        }
    }
}
