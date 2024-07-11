package DecoratorDesignPattern;

public class DecoratorExample {
	
    public static void main(String[] args) {
        Beverage beverage1 = new EspressoCoffee();
        beverage1 = new MochaAddon(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new CapuchhinoCoffee();
        beverage2 = new MochaAddon(beverage2);
        beverage2 = new MochaAddon(beverage2);
        beverage2 = new WhipAddOn(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
