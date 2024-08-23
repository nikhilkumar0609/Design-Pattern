package FactoryDesignPattern;

public class ActiveUIObjectConfiguration implements StatusService{

	@Override
	public void configureUIObject(Consent consent) {
		UIObject uiObject = new UIObject();
		uiObject.setBannerMsg("Consent is Active");
		uiObject.setAction("NONE");
		consent.setUiObject(uiObject);
	}

	@Override
	public Status getStatus() {
		return Status.ACTIVE;
	}

}
