package FactoryDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class FactoryExample {
	public static void main(String[] args) {
		Consent consent = new Consent();
		consent.setConsentStatus(Status.ACTIVE);
		
		List<StatusService> statusServiceList = new ArrayList<>();
		statusServiceList.add(new ActiveUIObjectConfiguration());
		statusServiceList.add(new InactiveUIObjectConfiguration());
		statusServiceList.add(new DeletedUIObjectConfiguration());
		
		StatusServiceFactory statusServiceFactory = new StatusServiceFactory(statusServiceList);
		StatusService statusService = statusServiceFactory.findStatusServiceByConsentStatus(consent.getConsentStatus());
        
        if (statusService != null) {
            statusService.configureUIObject(consent);
        } else {
            System.out.println("No matching StatusService found for the given status.");
        }
        
        System.out.println(consent);
	}
}
