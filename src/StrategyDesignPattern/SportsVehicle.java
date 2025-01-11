package StrategyDesignPattern;

import StrategyDesignPattern.Strategy.SpecialDriveStrategy;

public class SportsVehicle extends Vehicle{

	SportsVehicle() {
		super(new SpecialDriveStrategy());
	}

}
