package najah.edu.app;

import java.util.ArrayList;
import java.util.List;

public class ChooseByCombine{
	List<Home> homes=new ArrayList<>();
	List<Home> home;
	TheFinder f=new TheFinder();
	private static WebEmailService emailService;

	
public void sendAllHomes(List<Home> homes){
	this.homes=homes;
	
}


public void getObjFinder(TheFinder finder) {
	f=finder;
}
public static void setEmailservice(WebEmailService emailServicee) {
	emailService=emailServicee;
	
}
	public List<Home> combination(String ... condition) {
		int count=0;
		
		String[] a = null;
		CommonSpecification bathrooms = new ChooseByNumOfBathrooms(0);
		CommonSpecification rangeArea=new ChooseByRangeArea(0,0);
		CommonSpecification rangePrice=new ChooseByRangePrices(0,0);
		CommonSpecification bedrooms=new ChooseByNumOfBedrooms(0);
		CommonSpecification leaselength=new ChooseByLeaseLength(0);
		CommonSpecification price=new ChooseByPrice(0);
		CommonSpecification area=new ChooseByArea(0);
		ChooseByAmenities amenities=new ChooseByAmenities(a);
		CommonSpecification type=new ChooseByType("");
		CommonSpecification material=new ChooseByMaterial("");
		CommonSpecification placement=new ChooseByPlacement("");
		CommonSpecification pets=new ChooseByPets("");

		home=new ArrayList<>();
	    for(int i=0;i<homes.size();i++) {
	    	for(int k=0;k<condition.length;k++) {
	    		String[] splitCon=condition[k].split(":");
	    		count = bathrooms.isCount(count, i, splitCon,f);
	    		count = rangeArea.isCount(count, i, splitCon,f);
	    		count = rangePrice.isCount(count, i, splitCon,f);
	    		count = bedrooms.isCount(count, i, splitCon,f);
	    		count = leaselength.isCount(count, i, splitCon,f);
	    		count = price.isCount(count, i, splitCon,f);
	    		count = area.isCount(count, i, splitCon,f);
	    		count = amenities.isCount(count, splitCon,f);
	    		count = type.isCount(count, i, splitCon,f);
	    		count = material.isCount(count, i, splitCon,f);
	    		count = placement.isCount(count, i, splitCon,f);
	    		count = pets.isCount(count, i, splitCon,f);
	    	}
	    	if(count==condition.length) {
				  home.add(homes.get(i));

	    	}
	    	count=0;
	    	}

		emailService.sendEmail("waed.khalifa1@gmail.com", home);

	    return home;
		
		
		
		
	}

		
}