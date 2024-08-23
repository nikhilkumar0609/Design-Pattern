package FactoryDesignPattern;


public class Consent{
	public Status consentStatus;
	public UIObject uiObject;
	
	public Status getConsentStatus() {
		return consentStatus;
	}
	public void setConsentStatus(Status consentStatus) {
		this.consentStatus = consentStatus;
	}
	public UIObject getUiObject() {
		return uiObject;
	}
	public void setUiObject(UIObject uiObject) {
		this.uiObject = uiObject;
	}
	
	
	@Override
	public String toString() {
		return "Consent [consentStatus=" + consentStatus + ", uiObject=" + uiObject + "]";
	}
	
	
}

class UIObject {
	public String bannerMsg;
	public String action;
	
	public String getBannerMsg() {
		return bannerMsg;
	}
	public void setBannerMsg(String bannerMsg) {
		this.bannerMsg = bannerMsg;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	@Override
	public String toString() {
		return "UIObject [bannerMsg=" + bannerMsg + ", action=" + action + "]";
	}
	
	
}
