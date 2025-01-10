package StrategyDesignPattern;

public class OffRoadVehicle extends Vehicle {

	OffRoadVehicle() {
		super(new SpecialDriveStrategy());
	}

}
