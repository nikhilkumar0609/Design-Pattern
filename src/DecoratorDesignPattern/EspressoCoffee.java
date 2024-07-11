package DecoratorDesignPattern;

public class EspressoCoffee extends Beverage {
    
    public EspressoCoffee() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
