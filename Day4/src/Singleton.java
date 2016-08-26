
public class Singleton {
    public static void main(String[] args) {
        Car newCar = Car.getCar();
        Person newPerson = Person.getPerson();

        System.out.println("Хозяин " + newCar.getAzatsCar() + " это " + newPerson.getName());
    }

}
