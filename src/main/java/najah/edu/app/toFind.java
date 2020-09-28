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
	 
	   
	}



