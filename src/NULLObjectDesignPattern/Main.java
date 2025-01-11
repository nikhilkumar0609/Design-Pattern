package NULLObjectDesignPattern;

public class Main {
	public static void main(String[] args) {
		Vehicle vehicle = VehicleFactory.getVehicleObject("Car");
		System.out.println("Seating Capacity: " + vehicle.getSeatCapacity());
        System.out.println("Fuel Tank Capacity: " + vehicle.getTankCapacity());
        
        Vehicle vehicle1 = VehicleFactory.getVehicleObject("Bike");
		System.out.println("Seating Capacity: " + vehicle1.getSeatCapacity());
        System.out.println("Fuel Tank Capacity: " + vehicle1.getTankCapacity());
	}
}
