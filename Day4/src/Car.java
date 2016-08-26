public class Car {
    private static Car car;
    private String azatsCar = "Audi A7";

    private Car() {

    }

    public static synchronized Car getCar() {
        if (car == null) {
            car = new Car();
        }
        return car;
    }

    public String getAzatsCar() {
        return azatsCar;
    }
}
