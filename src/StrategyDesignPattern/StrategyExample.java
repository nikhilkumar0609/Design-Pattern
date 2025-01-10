package StrategyDesignPattern;

public class StrategyExample {

	public static void main(String[] args) {
		Vehicle vehicle = new SportsVehicle();
		vehicle.drive();
		
		Vehicle vehicle1 = new PassengerVehicle();
		vehicle1.drive();
		
		Vehicle vehicle2 = new GoodsVehicle();
		vehicle2.drive();
		
		Vehicle vehicle3 = new OffRoadVehicle();
		vehicle3.drive();
	}
}
