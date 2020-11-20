package najah.edu.acceptance_test;
    

import java.util.ArrayList;
import java.util.List;import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import najah.edu.app.Home;
import najah.edu.app.Amenities;
import najah.edu.app.ChooseByCombine;
import najah.edu.app.EmailHolderMocking;
import najah.edu.app.Material;
import najah.edu.app.Placement;
import najah.edu.app.Type;
import najah.edu.app.WebEmailService;
import najah.edu.app.TheFinder;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
public class SearchHomeSteps {
	 
	private String specification;
	private List<Home> byType;
	private List<Home> byMaterial;
	private List<Home> byPrice;
	private List<Home> byArea;
	private List<Home> byPlacement;
	private List<Home> byRangePrices;
	private List<Home> byPets;
	private List<Home> byAmenities;
	private List<Home> byRangeArea;
    private List<Home> byNumberOfBedrooms;
    private List<Home> byNumberOfBathrooms;
    private List<Home> byLeaseLength;
    private List<Home> byCommon;
    private List<Home> homs;
    private Home myHome;
    private ChooseByCombine combine;
	private EmailHolderMocking mockWebHolder;
	private Home checkHome;
	int count1=0;
	int count2=0;
	int price;
	int area;
	int p1;
	int p2;
	String S1,S2;
	int a1,a2;
	int numBedrooms;
	int numBathrooms;
	int LeaseLength;
	private TheFinder f;


	public SearchHomeSteps(TheFinder f,EmailHolderMocking mockWebHolderIn) {
		this.f=f;
		mockWebHolder=mockWebHolderIn;
	}
	
	@Given("these homes are contained in the system")
	public void theseHomesAreContainedInTheSystem(DataTable feature_repository)
	{ 	List<List<String>> FR = feature_repository.asLists(String.class);
	homs=new ArrayList<>();
	for (List<String> List : FR) {
		
		String[] parts1=List.get(0).split("_");
        String[] parts2=List.get(1).split("_");
        myHome=new Home();
    	   myHome.setType(new Type(parts1[0]));
           myHome.setMaterial(new Material(parts1[1]));
           myHome.setPlacement(new Placement(parts1[2]));
           myHome.setPets(parts1[3]);
           myHome.setAmenities(new Amenities(parts1[4]));
           myHome.setPrice(Integer.parseInt(parts2[0]));
           myHome.setArea(Integer.parseInt(parts2[1]));
           myHome.setNumOfBedrooms(Integer.parseInt(parts2[2]));
           myHome.setNumOfBathrooms(Integer.parseInt(parts2[3]));
           myHome.setLeaseLength(Integer.parseInt(parts2[4]));
           f.setHomes(myHome);
       
       homs.add(myHome);
    
       }		

	
	}
	
	@When("I search about home by {string}") 
	public void iSearchAboutHomeBy(String specification) 
	{ this.specification = specification;
	if (specification.equals(Type.APARTMENT)||specification.equals(Type.HOUSE)) { 
          byType=f.byType(specification); }
	
	else if (specification.equals(Material.WOOD)||specification.equals(Material.STONE)||
			specification.equals(Material.BRICK)) 
		{ byMaterial = f.byMaterial(specification); }
	
	else if (specification.equals(Placement.CITY)||specification.equals(Placement.VILLAGE))
	{ byPlacement = f.byPlacement(specification);

	}
	
	else if (specification.equals("YES")||specification.equals("NO"))
	{ byPets = f.byPets(specification); }
	
	else if ((specification.contains(Amenities.AIRCONDITIONING))||(specification.contains(Amenities.BALCONY))||
			(specification.contains(Amenities.ELEVATOR))||(specification.contains(Amenities.FIREPLACE))||(specification.contains(Amenities.GARAGEPARKING))||(specification.contains(Amenities.SWIMMINGPOOL))){
		String[] amee=specification.split(",");
		byAmenities=f.byAmenities(amee);

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
		
	}
	
	@When("I search about home with price less than {int}") 
	public void iSearchAboutHomeWithPriceLessThan(Integer price) {
		 this.price = price.intValue();
		byPrice=f.byPrice(this.price);

	}
	
	@Then("A list of homes that matches the price specification should be returned and printed on the console")
	 public void aListOfHomesThatMatchesThePriceSpecificationShouldBeReturnedAndPrintedOnTheConsole(){ 
		 assertEquals(3,byPrice.size());
	    	for(int k=0;k<byPrice.size();k++) {
		    	assertTrue(byPrice.get(k).getPrice()<price);
		    }
	}

	@When("I search about home with area less than {int}") 
	public void iSearchAboutHomeWithAreaLessThan(Integer area) {
		 this.area = area.intValue();
		byArea=f.byArea(this.area);
			
			}
	
	@Then("A list of homes that matches the area specification should be returned and printed on the console")
	 public void aListOfHomesThatMatchesTheAreaSpecificationShouldBeReturnedAndPrintedOnTheConsole(){ 

		
		  assertEquals(2,byArea.size());
		  for(int k=0;k<byArea.size();k++) {
			assertTrue(byArea.get(k).getArea()<area);
		   }
	
        
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
		
		
	}
	
	@When("I search about home by between range {int} and {int} of prices") 
	public void iSearchAboutHomeByBetweenRangeAndOfPrices(Integer price1, Integer price2) {
		 p1 = price1.intValue();
		 p2 = price2.intValue();
		byRangePrices=f.byRangePrices(p1,p2);
			
			}
	
	@Then("A list of homes that matches between range of prices should be returned and printed on the console")
	public void aListOfHomesThatMatchesTheRangeOfPricesShouldBeReturnedAndPrintedOnTheConsole() {
		assertEquals(3,byRangePrices.size());
		  for(int k=0;k<byRangePrices.size();k++) {
			assertTrue(byRangePrices.get(k).getPrice()>p1 && byRangePrices.get(k).getPrice()<p2);
		   }

		

	}
	
	@Then("A list of homes that matches the allow pets should be returned and printed on the console")
	public void aListOfHomesThatMatchesTheAllowPetsShouldBeReturnedAndPrintedOnTheConsole(){
		if (specification.equals("YES")) 
		{ assertEquals(2,byPets.size());
		for(int k=0;k<byPets.size();k++) {
			assertTrue(byPets.get(k).getPet().equals(specification)); 
			}
		}
		 
		else if (specification.equals("NO")) 
		{  
	        assertEquals(2,byPets.size()); 
		    for(int s=0;s<byPets.size();s++) {
	            { assertTrue(byPets.get(s).getPet().equals(specification)); } 
		     }
		}
		
		
		}
	

	@Then("A list of homes that matches the amenities specification should be returned and printed on the console")
	 public void aListOfHomesThatMatchesTheAmenitiesSpecificationShouldBeReturnedAndPrintedOnTheConsole(){ 
	
		for(int i=0;i<byAmenities.size();i++) {
			for(int j=0;j<f.getHomes().size();j++) {
		checkHome=new Home();
		checkHome=homs.get(j);
				if(byAmenities.get(i)==checkHome)
				{
					count2++;
				}
			}
		}
		assertEquals(count2,byAmenities.size());
	
	}
	
	@When("I search about home by area between {int} and {int}") 
	public void iSearchAboutHomeByAreaBetweenAnd(Integer area1, Integer area2) {
		 a1 = area1.intValue();
		a2 = area2.intValue();
		byRangeArea=f.byRangeArea(a1,a2);
			}
	@Then("A list of homes that matches the range of area should be returned and printed on the console")
	public void aListOfHomesThatMatchesTheRangeOfAreasShouldBeReturnedAndPrintedOnTheConsole() {
		 assertEquals(2,byRangeArea.size());
		  for(int k=0;k<byRangeArea.size();k++) {
			assertTrue(byRangeArea.get(k).getArea()>a1 && byRangeArea.get(k).getArea()<a2);
		   }
	
	}
	
	@When("I search about home by number of bedrooms {int}") 
	public void iSearchAboutHomeByNumberOfBedrooms(Integer number) 
	{ numBedrooms = number.intValue();
    byNumberOfBedrooms = f.byNumOfBedrooms(numBedrooms);
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


		}
	
	@When("I search about home by number of bathrooms {int}") 
	public void iSearchAboutHomeByNumberOfBathrooms(Integer number) 
	{ numBathrooms = number.intValue();
    byNumberOfBathrooms = f.byNumOfBathrooms(numBathrooms);
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
		  

	
		}
	
	
	@When("I search about home by lease length {int}") 
	public void iSearchAboutHomeByLeaseLength(Integer number) 
	{ LeaseLength = number.intValue();
    byLeaseLength = f.byLeaseLength(LeaseLength);

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

		
		}
	

	@When("I search about home by combination {string}") 
	public void iSearchAboutHomeByCombination(String s1) {

	S1=s1;
		String[] com1=S1.split(",");
		combine=new ChooseByCombine();
		combine.sendAllHomes(f.getHomes());
		combine.getObjFinder(f);
		byCommon=combine.combination(com1);
		
	

	}
	
	@Then("A list of homes that matches these specifications should be returned and printed on the console")
	public void aListOfHomesThatMatchesTheseSpecificationsShouldBeReturnedAndPrintedOnTheConsile() {
		for(int i=0;i<byCommon.size();i++) {
			for(int j=0;j<f.getHomes().size();j++) {
		checkHome=new Home();
		checkHome=homs.get(j);
				if(byCommon.get(i)==checkHome)
				{
					count1++;
				}
			}
		}
		assertEquals(count1,byCommon.size());
	}


	@Then("email with result should be send to user {string} with material information")
	public void emailWithResultShouldBeSendToUserWithMaterialInfrormation(String email){
			verify(mockWebHolder.getEmailService(),times(1)).sendEmail(email, byMaterial);

	}

	@Then("email with result should be send to user {string} with type information")
	public void emailWithResultShouldBeSendToUserWithTypeInfrormation(String email){
			verify(mockWebHolder.getEmailService(),times(1)).sendEmail(email, byType);

	}
	@Then("email with result should be send to user {string} with placement information")
	public void emailWithResultShouldBeSendToUserWithPlacementInfrormation(String email){
			verify(mockWebHolder.getEmailService(),times(1)).sendEmail(email, byPlacement);
	}
	
	@Then("email with result should be send to user {string} with leaselength information")
	public void emailWithResultShouldBeSendToUserWithLeaseLengthInfrormation(String email){
			verify(mockWebHolder.getEmailService(),times(1)).sendEmail(email, byLeaseLength);
	}
	@Then("email with result should be send to user {string} with price information")
	public void emailWithResultShouldBeSendToUserWithPriceInfrormation(String email){
			verify(mockWebHolder.getEmailService(),times(1)).sendEmail(email, byPrice);
	}
	@Then("email with result should be send to user {string} with area information")
	public void emailWithResultShouldBeSendToUserWithAreaInfrormation(String email){
			verify(mockWebHolder.getEmailService(),times(1)).sendEmail(email, byArea);
	}
	@Then("email with result should be send to user {string} with range of prices information")
	public void emailWithResultShouldBeSendToUserWithRangeOfPricesInfrormation(String email){
			verify(mockWebHolder.getEmailService(),times(1)).sendEmail(email, byRangePrices);
	}
	@Then("email with result should be send to user {string} with range of area information")
	public void emailWithResultShouldBeSendToUserWithRangeOfAreaInfrormation(String email){
			verify(mockWebHolder.getEmailService(),times(1)).sendEmail(email, byRangeArea);
	}
	@Then("email with result should be send to user {string} with bedrooms information")
	public void emailWithResultShouldBeSendToUserWithBedroomsInfrormation(String email){
			verify(mockWebHolder.getEmailService(),times(1)).sendEmail(email, byNumberOfBedrooms);
	}
	@Then("email with result should be send to user {string} with bathrooms information")
	public void emailWithResultShouldBeSendToUserWithBathroomsInfrormation(String email){
			verify(mockWebHolder.getEmailService(),times(1)).sendEmail(email, byNumberOfBathrooms);
	}
	@Then("email with result should be send to user {string} with combination information")
	public void emailWithResultShouldBeSendToUserWithCombinationInfrormation(String email){
			verify(mockWebHolder.getEmailService(),times(1)).sendEmail(email, byCommon);
	}
	@Then("email with result should be send to user {string} with pets information")
	public void emailWithResultShouldBeSendToUserWithPetsInfrormation(String email){
			verify(mockWebHolder.getEmailService(),times(1)).sendEmail(email, byPets);
	}
	@Then("email with result should be send to user {string} with amenities information")
	public void emailWithResultShouldBeSendToUserWithAmenitiesInfrormation(String email){
			verify(mockWebHolder.getEmailService(),times(1)).sendEmail(email, byAmenities);
	}
}