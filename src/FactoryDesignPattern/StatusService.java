package FactoryDesignPattern;

public interface StatusService {
	public void configureUIObject(Consent consent);
	public Status getStatus();
}
