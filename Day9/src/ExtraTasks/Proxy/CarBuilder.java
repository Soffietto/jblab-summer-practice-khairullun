package ExtraTasks.Proxy;


public class CarBuilder {
    String name;
    int maxSpeed;

    CarBuilder buildName(String name) {
        this.name = name;
        return this;
    }

    CarBuilder buildMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }

    Car build() {
        Car car = new Car();
        car.setName(name);
        car.setMaxSpeed(maxSpeed);
        return car;
    }

}
