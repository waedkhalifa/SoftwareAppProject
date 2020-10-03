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
	private List<Home> byArea;
	private List<Home> byPlacement;
	private List<Home> byRangePrices;
	private List<Home> byPets;
	private List<Home> byAmenities;
	private List<Home> byAnd;
	private List<Home> byRangeArea;
    private List<Home> byNumberOfBedrooms;
    private List<Home> byNumberOfBathrooms;
    private List<Home> byLeaseLength;
	int price;
	int area;
	int p1;
	int p2;
	String S1,S2;
	int a1,a2;
	int numBedrooms;
	int numBathrooms;
	int LeaseLength;
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
	
	else if (specification.equals(Placement.CITY)||specification.equals(Placement.VILLAGE))
	{ byPlacement = f.byPlacement(specification);

	}
	
	else if (specification.equals(Pets.YES)||specification.equals(Pets.NO))
	{ byPets = f.byPets(specification); }
	
	else if ((specification.contains(Amenities.AIRCONDITIONING))||(specification.contains(Amenities.BALCONY))||
			(specification.contains(Amenities.ELEVATOR))||(specification.contains(Amenities.FIREPLACE))||
					(specification.contains(Amenities.GARAGEPARKING))||(specification.contains(Amenities.SWIMMINGPOOL))){
		byAmenities=f.ByAmenities(specification);
	}
	
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
        assertEquals(2, byType.size()); 
	    for(int s=0;s<byType.size();s++) {
            { assertTrue(byType.get(s).getType().getTy().equals(specification)); } 
	     }
	}
	
//	for(int x=0;x<byType.size();x++)
	//{System.out.println(byType.get(x));}
	
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
	   assertEquals(1, byMaterial.size()); 
		for(int s=0;s<byMaterial.size();s++) {
	 {assertTrue(byMaterial.get(s).getMaterial().getMa().equals(specification));} 
		  }
		
		}
		
		else if (specification.equals(Material.BRICK)) 
		{  
			   assertEquals(1, byMaterial.size()); 
				for(int s=0;s<byMaterial.size();s++) {
			 { assertTrue(byMaterial.get(s).getMaterial().getMa().equals(specification)); } 
				}
		}
		/*for(int x=0;x<byMaterial.size();x++)
		{ System.out.println(byMaterial.get(x));}*/
	}
	
	@When("I search about home with price less than {int}") 
	public void iSearchAboutHomeWithPriceLessThan(Integer price) {
		 this.price = price.intValue();
		byPrice=f.ByPrice(this.price);

	}
	
	@Then("A list of homes that matches the price specification should be returned and printed on the console")
	 public void aListOfHomesThatMatchesThePriceSpecificationShouldBeReturnedAndPrintedOnTheConsole(){ 
		 assertEquals(3,byPrice.size());
	    	for(int k=0;k<byPrice.size();k++) {
		    	assertTrue(byPrice.get(k).getPrice()<price);
		    }
		
	
       /* for(int x=0;x<byPrice.size();x++)
           { System.out.println(byPrice.get(x)); }
	*/
	}
	
	@When("I search about home with area less than {int}") 
	public void iSearchAboutHomeWithAreaLessThan(Integer area) {
		 this.area = area.intValue();
		byArea=f.ByArea(this.area);
			
			}
	
	@Then("A list of homes that matches the area specification should be returned and printed on the console")
	 public void aListOfHomesThatMatchesTheAreaSpecificationShouldBeReturnedAndPrintedOnTheConsole(){ 
		  assertEquals(2,byArea.size());
		  for(int k=0;k<byArea.size();k++) {
			assertTrue(byArea.get(k).getArea()<area);
		   }
	
        /* for(int x=0;x<byArea.size();x++)
        { System.out.println(byArea.get(x)); }
	*/
	}
	
	@Then("A list of homes that matches the placement specification should be returned and printed on the console")
	public void aListOfHomesThatMatchesThePlacementSpecificationShouldBeReturnedAndPrintedOnTheConsole()
	{
		if(specification.equals(Placement.VILLAGE))
		{
			  assertEquals(1, byPlacement.size()); 
				for(int s=0;s<byPlacement.size();s++) {
			 { assertTrue(byPlacement.get(s).getPlacement().getPl().equals(specification));} 
	             }
	
         }
		
		else if(specification.equals(Placement.CITY)) 
		{
			 assertEquals(3, byPlacement.size()); 
				for(int p=0;p<byPlacement.size();p++) {
			 { assertTrue(byPlacement.get(p).getPlacement().getPl().equals(specification));} 
	             }
		}
		
		/*for(int x=0;x<byPlacement.size();x++)
		{
			System.out.println(byPlacement.get(x));
		}*/
	}
	
	@When("I search about home by between range {int} and {int} of prices") 
	public void iSearchAboutHomeByBetweenRangeAndOfPrices(Integer price1, Integer price2) {
		 p1 = price1.intValue();
		 p2 = price2.intValue();
		byRangePrices=f.ByRangePrices(p1,p2);
			
			}
	
	@Then("A list of homes that matches between range of prices should be returned and printed on the console")
	public void aListOfHomesThatMatchesTheRangeOfPricesShouldBeReturnedAndPrintedOnTheConsole() {
		assertEquals(3,byRangePrices.size());
		  for(int k=0;k<byRangePrices.size();k++) {
			assertTrue(byRangePrices.get(k).getPrice()>p1 && byRangePrices.get(k).getPrice()<p2);
		   }

		/*for(int x=0;x<byRangePrices.size();x++)
		{
			System.out.println(byRangePrices.get(x));
		}*/

	}
	
	@Then("A list of homes that matches the allow pets should be returned and printed on the console")
	public void aListOfHomesThatMatchesTheAllowPetsShouldBeReturnedAndPrintedOnTheConsole(){
		if (specification.equals(Pets.YES)) 
		{ assertEquals(2,byPets.size());
		for(int k=0;k<byPets.size();k++) {
			assertTrue(byPets.get(k).getPet().getPe().equals(specification)); 
			}
		}
		 
		else if (specification.equals(Pets.NO)) 
		{  
	        assertEquals(2,byPets.size()); 
		    for(int s=0;s<byPets.size();s++) {
	            { assertTrue(byPets.get(s).getPet().getPe().equals(specification)); } 
		     }
		}
		
		/*for(int x=0;x<byPets.size();x++)
		{System.out.println(byPets.get(x));}*/
		}
	

	@Then("A list of homes that matches the amenities specification should be returned and printed on the console")
	 public void aListOfHomesThatMatchesTheAmenitiesSpecificationShouldBeReturnedAndPrintedOnTheConsole(){ 
	if (specification.contains(Amenities.AIRCONDITIONING)) 
	{ assertEquals(1,byAmenities.size());
	
	}
	 
	if (specification.contains(Amenities.BALCONY)) 
	{ assertEquals(1,byAmenities.size());

	}
	
	if (specification.contains(Amenities.ELEVATOR)) 
	{ assertEquals(1,byAmenities.size());

	}
	
	if (specification.contains(Amenities.FIREPLACE)) 
	{ assertEquals(1,byAmenities.size());
	
	}
	
	if (specification.contains(Amenities.GARAGEPARKING)) 
	{ assertEquals(1,byAmenities.size());
	
	}
	
	if (specification.contains(Amenities.SWIMMINGPOOL)) 
	{ assertEquals(1,byAmenities.size());

	}
//	for(int x=0;x<byAmenities.size();x++)
	//{System.out.println(byAmenities.get(x));}
	
	}
	
	@When("I search about home by area between {int} and {int}") 
	public void iSearchAboutHomeByAreaBetweenAnd(Integer area1, Integer area2) {
		 a1 = area1.intValue();
		a2 = area2.intValue();
		byRangeArea=f.ByRangeArea(a1,a2);
			}
	@Then("A list of homes that matches the range of area should be returned and printed on the console")
	public void aListOfHomesThatMatchesTheRangeOfAreasShouldBeReturnedAndPrintedOnTheConsole() {
		 assertEquals(2,byRangeArea.size());
		  for(int k=0;k<byRangeArea.size();k++) {
			assertTrue(byRangeArea.get(k).getArea()>a1 && byRangeArea.get(k).getArea()<a2);
		   }
	//	for(int x=0;x<byRangeArea.size();x++)
		//{
			//System.out.println(byRangeArea.get(x));
		//}
	}
	
	@When("I search about home by number of bedrooms {int}") 
	public void iSearchAboutHomeByNumberOfBedrooms(Integer number) 
	{ numBedrooms = number.intValue();
    byNumberOfBedrooms = f.ByNumOfBedrooms(numBedrooms);
	}
	
	@Then("A list of homes that matches the number of bedrooms should be returned and printed on the console")
	public void aListOfHomesThatMatchesTheNumberOfBedroomsShouldBeReturnedAndPrintedOnTheConsole(){
		
		if (numBedrooms==1) 
		{ 
			 assertEquals(0,byNumberOfBedrooms.size());
		
		}
		else if (numBedrooms==2) 
		{ 
			 assertEquals(0,byNumberOfBedrooms.size());
			
		}
		else if (numBedrooms==3) 
		{  
			 assertEquals(1,byNumberOfBedrooms.size());
		
		}
		 
		else if (numBedrooms==4) 
		{  
			 assertEquals(2,byNumberOfBedrooms.size());
		
		}
		
		else if (numBedrooms==5) 
		{  
			 assertEquals(1,byNumberOfBedrooms.size());
		
		}

//		for(int x=0;x<byNumberOfBedrooms.size();x++)
//		{System.out.println(byNumberOfBedrooms.get(x));}
		}
	
	@When("I search about home by number of bathrooms {int}") 
	public void iSearchAboutHomeByNumberOfBathrooms(Integer number) 
	{ numBathrooms = number.intValue();
    byNumberOfBathrooms = f.ByNumOfBathrooms(numBathrooms);
	}
	
	@Then("A list of homes that matches the number of bathrooms should be returned and printed on the console")
	public void aListOfHomesThatMatchesTheNumberOfBathroomsShouldBeReturnedAndPrintedOnTheConsole(){
		if (numBathrooms==1) 
		{ 
			assertEquals(0,byNumberOfBathrooms.size());
		
		}
		else if (numBathrooms==2) 
		{ 
			assertEquals(2,byNumberOfBathrooms.size());
			
		}
		else if (numBathrooms==3) 
		{  
			assertEquals(2,byNumberOfBathrooms.size());
		
		}
		  

	//	for(int x=0;x<byNumberOfBathrooms.size();x++)
		//{System.out.println(byNumberOfBathrooms.get(x));}
		}
	
	
	@When("I search about home by lease length {int}") 
	public void iSearchAboutHomeByLeaseLength(Integer number) 
	{ LeaseLength = number.intValue();
    byLeaseLength = f.ByLeaseLength(LeaseLength);
	}
	
	
	@Then("A list of homes that matches the lease length should be returned and printed on the console")
	public void aListOfHomesThatMatchesTheLeaseLengthShouldBeReturnedAndPrintedOnTheConsole(){
		
		if (LeaseLength==6) 
		{ 
			assertEquals(2,byLeaseLength.size());
		
		}
		else if (LeaseLength==7) 
		{ 
			assertEquals(0,byLeaseLength.size());
		}
		
		else if (LeaseLength==8) 
		{ 
			assertEquals(0,byLeaseLength.size());
		}
		
		else if (LeaseLength==9) 
		{ 
			assertEquals(0,byLeaseLength.size());
		}
		
		else if (LeaseLength==10) 
		{ 
			assertEquals(0,byLeaseLength.size());
		}
		
		else if (LeaseLength==11) 
		{ 
			assertEquals(0,byLeaseLength.size());
		}
		
		else if (LeaseLength==12) 
		{ 
			assertEquals(2,byLeaseLength.size());
		}

		//for(int x=0;x<byLeaseLength.size();x++)
		//{System.out.println(byLeaseLength.get(x));}
		}
	
	@When("I search about home by {string} and by {string}") 
	public void iSearchAboutHomeByAndBy(String s1,String s2) {
		S1=s1;
		S2=s2;
		if ((S1.equals(Type.APARTMENT)||S1.equals(Type.HOUSE))&&(S2.equals(Material.WOOD)||S2.equals(Material.STONE)||
				S2.equals(Material.BRICK)) ) { 
	          byAnd=f.ByAnd(S1,S2); }
		
	}

	
	@Then("A list of homes that matches the type and material specification should be returned and printed on the console")
	public void aListOfHomesThatMatchesTheTypeAndMaterialShouldBeReturnedAndPrintedOnTheConsole(){
		if (S1.equals(Type.APARTMENT)&&S2.equals(Material.WOOD)) 
		{ assertEquals(1,byAnd.size());
		
		}
		else if (S1.equals(Type.APARTMENT)&&S2.equals(Material.STONE)) 
		{ assertEquals(0,byAnd.size());
		
		}
		
		else if (S1.equals(Type.APARTMENT)&&S2.equals(Material.BRICK)) 
		{ assertEquals(1,byAnd.size());
		
		}
		 
		
	//	for(int x=0;x<byAnd.size();x++)
		//{ System.out.println(byAnd.get(x));}
	
	}
	

	
	
}