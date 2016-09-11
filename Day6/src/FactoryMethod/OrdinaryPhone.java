package FactoryMethod;

public class OrdinaryPhone implements Phone {
    @Override
    public void showMessage() {
        System.out.println("Ordinary String");
    }
}
