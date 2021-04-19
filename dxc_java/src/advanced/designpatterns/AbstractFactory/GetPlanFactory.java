package advanced.designpatterns.AbstractFactory;

public class GetPlanFactory {
	
	public Plan getPlan(String planType) {

	if(planType == null){  
		return null;  
	}  
	if(planType.equalsIgnoreCase("DOMESTICPLAN")) {  
		return new DomesticPlab();  
	}   
	else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){  
		return new CommercialPlan();  
	}   
	else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {  
		return new InstitionalPlan();  
	}  
	return null;  
}
}