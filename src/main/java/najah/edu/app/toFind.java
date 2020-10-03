package najah.edu.app;
import java.util.ArrayList;
import java.util.List;

  
public class toFind {

	 private List<Home> homes=new ArrayList<Home>();

	 public void setHomes(Home h) {
	    homes.add(h);

	    }

	   public List<Home> Bytype(String specification) {
		   
	     List<Home> H=new ArrayList<Home>();

	    	for(int i=0;i<homes.size();i++) {
				if (homes.get(i).getType().getTy().equalsIgnoreCase(specification))
				{
				H.add(homes.get(i));
				
				}
	    	}

	    	return H;
	    	}

	public List<Home> ByMaterial(String specification) {
	     List<Home> H=new ArrayList<Home>();

		    
	    	for(int i=0;i<homes.size();i++) {
				if (homes.get(i).getMaterial().getMa().equalsIgnoreCase(specification))
				{
				H.add(homes.get(i));
				}
	    	}
	    	return H;
	}
	
	 public List<Home> ByPrice(int price) {
		   
	     List<Home> H=new ArrayList<Home>();

	     
	    	for(int i=0;i<homes.size();i++) {
				if (homes.get(i).getPrice()<price)
				{
				H.add(homes.get(i));
				}
	    	}
	    	return H;
	 }
	 
	 public List<Home> ByArea(int area) {
		   
	     List<Home> H=new ArrayList<Home>();
	  
	     
	    	for(int i=0;i<homes.size();i++) {
				if (homes.get(i).getArea()<area)
				{
				H.add(homes.get(i));
				}
	    	}
	    	return H;
	 }

	public List<Home> byPlacement(String specification) {

			   List<Home> H=new ArrayList<Home>();
				 
			   
		    	for(int i=0;i<homes.size();i++) {
					if (homes.get(i).getPlacement().getPl().equalsIgnoreCase(specification))
					{
					H.add(homes.get(i));
					}
		    	}
		    	return H;
	}

	public List<Home> ByRangePrices(int p1, int p2) {

		 List<Home> H=new ArrayList<Home>();
		  
		 
	    	for(int i=0;i<homes.size();i++) {
				if ((homes.get(i).getPrice() > p1) && (homes.get(i).getPrice()<p2))
				{
				H.add(homes.get(i));
				}
	    	}
	    	return H;
		
	}
	
	public List<Home> byPets(String specification) {
		 List<Home> H=new ArrayList<Home>();
		  
		 
	    	for(int i=0;i<homes.size();i++) {
				if (homes.get(i).getPet().getPe().equalsIgnoreCase(specification))
				{
				H.add(homes.get(i));
				}
	    	}
	    	return H;
		
	}

	public List<Home> ByAmenities(String specification) {
		List<Home> H=new ArrayList<Home>();
		
		
    	for(int i=0;i<homes.size();i++) {		  
    		int u=0;
            String[] parts=homes.get(i).getAmenities().getAm().split(",");
            String[] pa=specification.split(",");
            int x=pa.length;
            for(int k=0;k<parts.length;k++) {
            for(int j=0;j<x;j++) {
             	if (parts[k].contains(pa[j]))
	               {
                u++;
	               }}
            }
			if(u==pa.length) {
                H.add(homes.get(i));
			}
    	  }
    	
    	//System.out.println(H);
    	
    	return H;
	}
	 
	public List<Home> ByAnd(String ... specifications) {
		 List<Home> H=new ArrayList<Home>();
	
		 
		 for(int x=0;x<homes.size();x++) {

				if ((homes.get(x).getType().getTy().equals(specifications[0]))&&(homes.get(x).getMaterial().getMa().equals(specifications[1])))
				{

								H.add(homes.get(x));
				
				}
						
		      }
	

	    	return H;
	}

	public List<Home> ByRangeArea(int a1, int a2) {
		 List<Home> H=new ArrayList<Home>();

		 
	    	for(int i=0;i<homes.size();i++) {
				if ((homes.get(i).getArea() > a1) && (homes.get(i).getArea()<a2))
				{
				H.add(homes.get(i));
				}
	    	}
	    	return H;
		
	}

	public List<Home> ByNumOfBedrooms(int numBedrooms) {
	     List<Home> H=new ArrayList<Home>();

	     
	    	for(int i=0;i<homes.size();i++) {
				if (homes.get(i).getNumOfBedrooms()==numBedrooms)
				{
				H.add(homes.get(i));
				}
	    	}
	    	return H;
	}

	public List<Home> ByNumOfBathrooms(int numBathrooms) {
		 List<Home> H=new ArrayList<Home>();

		 
	    	for(int i=0;i<homes.size();i++) {
				if (homes.get(i).getNumOfBathrooms()==numBathrooms)
				{
				H.add(homes.get(i));
				}
	    	}
	    	return H;
	}

	public List<Home> ByLeaseLength(int leaseLength) {
		 List<Home> H=new ArrayList<Home>();
	
		 
	    	for(int i=0;i<homes.size();i++) {
				if (homes.get(i).getLeaseLength()==leaseLength)
				{
				H.add(homes.get(i));
				}
	    	}
	    	return H;
	}

	
	 
	}



