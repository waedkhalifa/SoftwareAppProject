package najah.edu.acceptance_test;
    
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import najah.edu.app.Home;
import najah.edu.app.Amenities;
import najah.edu.app.Material;
import najah.edu.app.Pets;
import najah.edu.app.Placement;
import najah.edu.app.Type;
import najah.edu.app.toFind;

public class SearchHomeSteps {
	
	private String specification;
	private static List<Home> byType;
	private List<Home> byMaterial;
	private List<Home> byPrice;
	int price;
	private toFind f;

	public SearchHomeSteps(toFind f) {
		this.f=f;
	}
	
	@Given("these homes are contained in the system")
	public void theseHomesAreContainedInTheSystem(DataTable feature_repository)
	{ 	List<List<String>> FR = feature_repository.asLists(String.class);
	for (List<String> List : FR) {
		
		String[] parts1=List.get(0).split("_");
        String[] parts2=List.get(1).split("_");
  
    f.setHomes(new Home(new Type(parts1[0]), new Material(parts1[1]), new Placement(parts1[2]),new Pets(parts1[3]),
        		new Amenities(parts1[4]),Integer.parseInt(parts2[0]),Integer.parseInt(parts2[1]),Integer.parseInt(parts2[2]),
        		Integer.parseInt(parts2[3]), Integer.parseInt(parts2[4])));
       }		
    
	}
	
	@When("I search about home by {string}") 
	public void iSearchAboutHomeBy(String specification) 
	{ this.specification = specification;
	if (specification.equals(Type.APARTMENT)||specification.equals(Type.HOUSE)) { 
          byType=f.Bytype(specification); }
	
	else if (specification.equals(Material.WOOD)||specification.equals(Material.STONE)||
			specification.equals(Material.BRICK)) 
		{ byMaterial = f.ByMaterial(specification); }
	
	}
	
	@Then("A list of homes that matches the type specification should be returned and printed on the console")
	 public void aListOfHomesThatMatchesTheTypeSpecificationShouldBeReturnedAndPrintedOnTheConsole(){ 
	if (specification.equals(Type.APARTMENT)) 
	{ assertEquals(2,byType.size());
	for(int k=0;k<byType.size();k++) {
		assertTrue(byType.get(k).getType().getTy().equals(specification)); 
		}
	}
	 
	else if (specification.equals(Type.HOUSE)) 
	{  
        assertEquals(1, byType.size()); 
	    for(int s=0;s<byType.size();s++) {
            { assertTrue(byType.get(s).getType().getTy().equals(specification)); } 
	     }
	}
	
	for(int x=0;x<byType.size();x++)
	{System.out.println(byType.get(x));}
	}
	
	@Then("A list of homes that matches the material specification should be returned and printed on the console")
	 public void aListOfHomesThatMatchesTheMaterialSpecificationShouldBeReturnedAndPrintedOnTheConsole(){ 
		if (specification.equals(Material.WOOD)) 
		{ assertEquals(2,byMaterial.size());
		for(int k=0;k<byMaterial.size();k++)
		{ assertTrue(byMaterial.get(k).getMaterial().getMa().equals(specification));}
		
		}
		 
		else if (specification.equals(Material.STONE)) 
		{  
	   assertEquals(0, byMaterial.size()); 
		for(int s=0;s<byMaterial.size();s++) {
	 {assertTrue(byMaterial.get(s).getType().getTy().equals(specification));} 
		  }
		
		}
		
		else if (specification.equals(Material.BRICK)) 
		{  
			   assertEquals(1, byMaterial.size()); 
				for(int s=0;s<byMaterial.size();s++) {
			 { assertTrue(byMaterial.get(s).getMaterial().getMa().equals(specification)); } 
				}
		}
		for(int x=0;x<byMaterial.size();x++)
		{ System.out.println(byMaterial.get(x));}
	}
	
	@When("I search about home with price less than {int}") 
	public void iSearchAboutHomeWithPriceLessThan(Integer price) {
		 this.price = price.intValue();
		byPrice=f.ByPrice(this.price);
	}
	
	@Then("A list of homes that matches the price specification should be returned and printed on the console")
	 public void aListOfHomesThatMatchesThePriceSpecificationShouldBeReturnedAndPrintedOnTheConsole(){ 
		if (price<400) 
		{ assertEquals(2,byPrice.size());
	    	for(int k=0;k<byPrice.size();k++) {
		    	assertTrue(byPrice.get(k).getPrice()<price);
		    }
		}
	
        for(int x=0;x<byPrice.size();x++)
           { System.out.println(byPrice.get(x)); }
	
	}

}