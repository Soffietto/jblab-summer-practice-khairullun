package Decorator;

/**
 * Created by Azot- on 26.08.2016.
 */
public class Person implements Decorator {
    Decorator person;

    @Override
    public void print() {
        System.out.println("Azat");
    }
}
