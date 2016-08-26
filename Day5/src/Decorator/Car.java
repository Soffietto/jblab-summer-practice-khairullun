package Decorator;

/**
 * Created by Azot- on 26.08.2016.
 */
public class Car implements Decorator {
    Decorator car;

    public Car(Decorator smt) {
        this.car = smt;
    }

    @Override
    public void print() {
        System.out.println("Audi");
        car.print();
    }
}
