
public class Person {
    private static volatile Person person;
    private String name = "Azat";

    private Person() {

    }

    public static synchronized Person getPerson() {
        if (person == null) {
            person = new Person();
        }
        return person;
    }

    public String getName() {
        return name;
    }
}
