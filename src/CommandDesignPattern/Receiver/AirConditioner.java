package CommandDesignPattern.Receiver;

public class AirConditioner {
	
	public boolean isOn;
	public int temperature;
	
	public void turnOnAc() {
		isOn = true;
		System.out.println("Ac is On!");
	}
	
	public void turnOffAc() {
		isOn = false;
		System.out.println("Ac is Off!");
	}
	
	public void setTemperature(int temp) {
		this.temperature = temp;
		System.out.println("Temperature is : " + temp);
	}
	
}
