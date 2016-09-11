package FactoryMethod;


public class OrdinaryPhoneMaker implements PhoneMaker {
    @Override
    public Phone createPhone() {
        return new OrdinaryPhone();
    }
}
