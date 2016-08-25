public class Car {
    private static Car car;
    private static String azatsCar;
    public static synchronized Car getCar(){
        if(car == null){
            car = new Car();
            azatsCar = "Audi A7";
        }
        return car;
    }

    public String getAzatsCar(){
        return azatsCar;
    }
}
