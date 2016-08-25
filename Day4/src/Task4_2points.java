
public class Task4_2points {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 0; i <args.length ; i++) {
            if(i%3==0){
                sum +=Integer.parseInt(args[i]);
            }
        }
        System.out.println(sum);
    }
}
