package AmazonNotificationProblem;

import java.util.ArrayList;
import java.util.List;

public class IphoneStocksObservableImpl implements StocksObservable{

	public List<NotificationAlertObserver> observerList = new ArrayList<>();
	public int stockCount = 0;
	
	@Override
	public void add(NotificationAlertObserver observer) {
		observerList.add(observer);
	}

	@Override
	public void remove(NotificationAlertObserver observer) {
		observerList.remove(observer);
	}

	@Override
	public void notifySubscribers() {
		for(NotificationAlertObserver ob : observerList) {
			ob.update();
		}
	}

	@Override
	public void setStockCount(int newStockAdded) {
		if(stockCount == 0) {
			notifySubscribers();
		}
		stockCount += newStockAdded;
	}

	@Override
	public int getStockCount() {
		return stockCount;
	}

}
