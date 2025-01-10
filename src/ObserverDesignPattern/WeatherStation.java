package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{

	private List<Observer> observerList = new ArrayList<>();
	private float temperature;
	
    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObserver();
    }
	
	@Override
	public void registerObserver(Observer observer) {
		observerList.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observerList.remove(observer);
	}

	@Override
	public void notifyObserver() {
		for(Observer ob : observerList) {
			ob.update(temperature);
		}
	}

}
