package DecoratorDesignPattern;

public class CapuchhinoCoffee extends Beverage {

    public CapuchhinoCoffee() {
        description = "Capuchhino Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
