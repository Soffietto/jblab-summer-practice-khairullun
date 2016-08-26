package Decorator;

/**
 * Created by Azot- on 26.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        Decorator result = new Car(new Person());
        result.print();
    }
}
