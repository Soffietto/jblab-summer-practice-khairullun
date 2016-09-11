package ExtraTasks.Proxy;

import java.lang.reflect.Proxy;

public class Car implements CarAction {
    String name;
    int maxSpeed;

    public static CarAction createCarBuilder(CarAction car) {

        return (CarAction) (Proxy.newProxyInstance(CarAction.class.getClassLoader(), new Class[]{CarAction.class}, new CarBuilderInvocationHandler(car)));

    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void race() {
        System.out.println("Race has begun");
    }
}
