
public class Person {
    private static Person person;
    private static String name;
    public static synchronized Person getPerson(){
        if(person == null){
            person = new Person();
            name = "Azat";
        }
        return person;
    }

    public String getName(){
        return name;
    }
}
