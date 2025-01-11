package StrategyDesignPattern;

import StrategyDesignPattern.Strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle{
	
	PassengerVehicle(){
		super(new NormalDriveStrategy());
	}

}
