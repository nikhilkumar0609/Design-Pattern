package DecoratorDesignPattern.Decorator;

import DecoratorDesignPattern.Beverage;

public abstract class AddonDecorator extends Beverage {
	public abstract String getDescription();
}
