package FactoryMethod;

public class Main {
    public static void main(String[] args) {
        PhoneMaker maker = new OrdinaryPhoneMaker(); //new SmartPhoneMaker();
        Phone phone = maker.createPhone();
        phone.showMessage();
    }
}
