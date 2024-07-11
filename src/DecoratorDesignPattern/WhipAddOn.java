package DecoratorDesignPattern;

public class WhipAddOn extends AddonDecorator {
    Beverage beverage;

    public WhipAddOn(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return .40 + beverage.cost();
    }
}
