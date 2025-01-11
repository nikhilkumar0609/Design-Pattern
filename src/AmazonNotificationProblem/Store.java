package AmazonNotificationProblem;

import AmazonNotificationProblem.Observable.IphoneStocksObservableImpl;
import AmazonNotificationProblem.Observable.StocksObservable;
import AmazonNotificationProblem.Observer.EmailAlertObserverimpl;
import AmazonNotificationProblem.Observer.NotificationAlertObserver;
import AmazonNotificationProblem.Observer.PhoneAlertObserverimpl;

public class Store {

	public static void main(String[] args) {
		
		StocksObservable iphoneStockObservable = new IphoneStocksObservableImpl();
		
		NotificationAlertObserver ob1 = new EmailAlertObserverimpl("abc@gmail.com", iphoneStockObservable);
		NotificationAlertObserver ob2 = new PhoneAlertObserverimpl("9876543210", iphoneStockObservable);
		
		iphoneStockObservable.add(ob1);
		iphoneStockObservable.add(ob2);
		
        iphoneStockObservable.setStockCount(0);
        iphoneStockObservable.setStockCount(10);
        iphoneStockObservable.setStockCount(100);
	}
	
}
