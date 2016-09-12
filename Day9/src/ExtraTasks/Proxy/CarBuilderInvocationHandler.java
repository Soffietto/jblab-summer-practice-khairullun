package ExtraTasks.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Azot- on 12.09.2016.
 */
public class CarBuilderInvocationHandler implements InvocationHandler {
    private CarAction wrapper;

    public CarBuilderInvocationHandler(CarAction car){
        wrapper = car;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long time = System.currentTimeMillis();
        Object dataOutput = method.invoke(wrapper,args);
        time = System.currentTimeMillis() - time;
        System.out.println(method.getName() + " works for " + time);
        return dataOutput;
    }

    public static void main(String[] args) {
        Car car = new CarBuilder().buildName("Audi").buildMaxSpeed(200).build();
        car.race();
        CarAction carAction =  car.createCarBuilder(car);
        carAction.race();
    }
}
