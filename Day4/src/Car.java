public class Car {
    private static Person instance;
    private static String azatsCar;
    public static synchronized Person getInstance(){
        if(instance == null){
            instance = new Person();
            azatsCar = "Audi A7";
        }
        return instance;
    }

    public String getAzatsCar(){
        return azatsCar;
    }
}
