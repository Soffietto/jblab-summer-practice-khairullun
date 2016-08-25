
public class Person {
    private static Person instance;
    private static String name;
    public static synchronized Person getInstance(){
        if(instance == null){
            instance = new Person();
            name = "Azat";
        }
        return instance;
    }

    public String getName(){
        return name;
    }
}
