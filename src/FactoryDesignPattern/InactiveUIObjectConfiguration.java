package FactoryDesignPattern;

public class InactiveUIObjectConfiguration implements StatusService{

	@Override
	public void configureUIObject(Consent consent) {
		UIObject uiObject = new UIObject();
		uiObject.setBannerMsg("Consent is Inctive");
		uiObject.setAction("Manage Connection");
		consent.setUiObject(uiObject);
	}

	@Override
	public Status getStatus() {
		return Status.INACTIVE;
	}

}
