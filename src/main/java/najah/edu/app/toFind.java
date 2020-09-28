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
				if (homes.get(i).getMaterial().getMa().contains(specification))
				{
				H.add(homes.get(i));
				}
	    	}
	    	return H;
	}
	   
	 
	   
	}



