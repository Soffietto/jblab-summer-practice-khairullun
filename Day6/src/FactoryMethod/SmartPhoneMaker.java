package FactoryMethod;

public class SmartPhoneMaker implements PhoneMaker {
    @Override
    public Phone createPhone() {
        return new SmartPhone();
    }
}
