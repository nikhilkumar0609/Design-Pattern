package FacadeDesignPattern;

public class OrderFacade {
	ProductDAO productDAO;
	Invoice invoice;
	Payment payment;
	Notification notification;
	
	public OrderFacade() {
		productDAO = new ProductDAO();
		invoice = new Invoice();
		payment = new Payment();
		notification = new Notification();
	}
	
	public void createOrder() {
		Product product = productDAO.getProduct(1);
		payment.makePayment();
		invoice.generateInvoice();
		notification.sendNotification();
		System.out.println("Order Created Successfully!");
	}
}
