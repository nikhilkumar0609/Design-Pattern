package NULLObjectDesignPattern;

public class VehicleFactory {

	static Vehicle getVehicleObject(String vehicle) {
		if("Car".equals(vehicle)) {
			return new Car();
		}
		return new NullObject();
	}
	
}
