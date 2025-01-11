package StrategyDesignPattern;

import StrategyDesignPattern.Strategy.SpecialDriveStrategy;

public class OffRoadVehicle extends Vehicle {

	OffRoadVehicle() {
		super(new SpecialDriveStrategy());
	}

}
