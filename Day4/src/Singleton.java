
public class Singleton {
    public static void main(String[] args) {
        Car newCar = new Car();
        Person newPerson = new Person();

        System.out.println("Хозяин " + newCar.getAzatsCar() + " это " + newPerson.getName());
    }

}
