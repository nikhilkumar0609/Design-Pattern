package AmazonNotificationProblem.Observer;

import AmazonNotificationProblem.Observable.StocksObservable;

public class PhoneAlertObserverimpl implements NotificationAlertObserver{

	String phoneNumber;
	StocksObservable observable;
	
	public PhoneAlertObserverimpl(String phoneNumber, StocksObservable observable) {
		this.observable = observable;
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public void update() {
		sendmsgOnPhone(phoneNumber, "Product is in stock, Hurry Up!");
	}

	private void sendmsgOnPhone(String phoneNumber, String string) {
		System.out.println("Message sent to :" + phoneNumber);
	}

}
