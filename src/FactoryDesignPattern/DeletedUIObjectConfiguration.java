package FactoryDesignPattern;

public class DeletedUIObjectConfiguration implements StatusService{

	@Override
	public void configureUIObject(Consent consent) {
		UIObject uiObject = new UIObject();
		uiObject.setBannerMsg("Consent is Deleted");
		uiObject.setAction("NONE");	
		consent.setUiObject(uiObject);
	}

	@Override
	public Status getStatus() {
		return Status.DELETED;
	}

}
