package StrategyDesignPattern;

import StrategyDesignPattern.Strategy.DriveStrategy;

public class Vehicle {
	
	DriveStrategy driveObject;
	
	Vehicle(DriveStrategy obj){
		this.driveObject = obj;
	}
	
	public void drive() {
		driveObject.drive();
	}
	
}
