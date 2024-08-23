package FactoryDesignPattern;

import java.util.List;

public class StatusServiceFactory {
	
	List<StatusService> statusServiceList;
	
	public StatusServiceFactory(List<StatusService> statusServiceList) {
		this.statusServiceList = statusServiceList;
	}
	
	public StatusService findStatusServiceByConsentStatus(Status consentStatus) {
	    return statusServiceList.stream()
	                            .filter(statusService -> statusService.getStatus().equals(consentStatus))
	                            .findFirst()
	                            .orElse(null);
	}

	
}
