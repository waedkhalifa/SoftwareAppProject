package najah.edu.app;
import java.util.ArrayList;
import java.util.List;

  
public class TheFinder {

	 List<Home> homes=new ArrayList<>();

	 String email="waed.khalifa1@gmail.com";
	private static WebEmailService emailService;
	
	 public void setHomes(Home h) {
	    homes.add(h);

	    }


	 public List<Home> getHomes(){
		 return homes;
	 }
	 
	 public static void setEmailservice(WebEmailService emailServicee) {
			emailService=emailServicee;
			
		}
	
	 
	   public List<Home> byType(String specification) {
		   
		 CommonSpecification condition = new ChooseByType(specification);
		    emailServiceSend(condition);

	     return commonBy(condition);
	    }

	public void emailServiceSend(CommonSpecification condition) {
		emailService.sendEmail(email, commonBy(condition));
	}

	private List<Home> commonBy(CommonSpecification condition) {
		List<Home> home=new ArrayList<>();

	    for(int i=0;i<homes.size();i++) {
			if (condition.isFound(this, i))
				{
				  home.add(homes.get(i));

				} 
	    	}
	    return home;
	}
	
	   

	public List<Home> byMaterial(String specification) {
		CommonSpecification condition =new ChooseByMaterial(specification);
	    emailServiceSend(condition);

	     return commonBy(condition);
	}

	public List<Home> byPrice(int price) {
		   
		CommonSpecification condition =new ChooseByPrice(price);
	    emailServiceSend(condition);

	     return commonBy(condition);
	 }

	
	public List<Home> byArea(int area) {
		   
		CommonSpecification condition= new ChooseByArea(area);
	    emailServiceSend(condition);

	     return commonBy(condition);
	 }

	public List<Home> byPlacement(String specification) {
		CommonSpecification condition=new ChooseByPlacement(specification);
		
	    emailServiceSend(condition);
			   return commonBy(condition);
	}

	public List<Home> byRangePrices(int p1, int p2) {
		
		CommonSpecification condition=new ChooseByRangePrices(p1,p2);
	    emailServiceSend(condition);

		 return commonBy(condition);
		
	}

	public List<Home> byPets(String specification) {
		CommonSpecification condition=new ChooseByPets(specification);
	    emailServiceSend(condition);
		 return commonBy(condition);
		
	}

	
	public List<Home> byAmenities(String[] specification) {
		ChooseByAmenities condition=new ChooseByAmenities(specification);
        int count=0;
		List<Home> home=new ArrayList<>();
		for(int i=0;i<homes.size();i++) {

			for(int q=0;q<specification.length;q++) {
			if (condition.isFoundAm(this, i, q))
			{
             count++;
			}
    	}
			if(count == specification.length && count== homes.get(i).getAmenities().getAm().split(",").length) {
				home.add(homes.get(i));
				
			}
			count=0;
		}		
	    emailService.sendEmail(email, home);

    	return home;
	}

	

	public List<Home> byRangeArea(int a1, int a2) {
		CommonSpecification condition =new ChooseByRangeArea(a1,a2);
	    emailServiceSend(condition);

		 return commonBy(condition);
		
	}

	public List<Home> byNumOfBedrooms(int numBedrooms) {
		CommonSpecification condition=new ChooseByNumOfBedrooms(numBedrooms);
	    emailServiceSend(condition);

	     return commonBy(condition);
	}

	public List<Home> byNumOfBathrooms(int numBathrooms) {
		CommonSpecification condition =new ChooseByNumOfBathrooms(numBathrooms);
	    emailServiceSend(condition);

		 return commonBy(condition);
	}

	public List<Home> byLeaseLength(int leaseLength) {
		CommonSpecification condition=new ChooseByLeaseLength(leaseLength);
	    emailServiceSend(condition);

		 return commonBy(condition);
	}


	
	 
	}



