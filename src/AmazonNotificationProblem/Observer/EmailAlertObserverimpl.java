package AmazonNotificationProblem.Observer;

import AmazonNotificationProblem.Observable.StocksObservable;

public class EmailAlertObserverimpl implements NotificationAlertObserver{

	String emailId;
	StocksObservable observable;
	
	public EmailAlertObserverimpl(String emailId, StocksObservable observable) {
		this.emailId = emailId;
		this.observable = observable;
	}
	
	@Override
	public void update() {
		sendMail(emailId, "Product is in stock, Hurry Up!");
	}

	private void sendMail(String emailId2, String string) {
		System.out.println("Mail sent to : " + emailId);
	}

}
