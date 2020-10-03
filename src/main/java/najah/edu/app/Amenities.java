package najah.edu.app;

public class Amenities {
	public static final String ELEVATOR = "ELEVATOR";
	public static final String FIREPLACE = "FIREPLACE";
	public static final String GARAGEPARKING = "GARAGEPARKING";
	public static final String AIRCONDITIONING = "AIRCONDITIONING";
	public static final String BALCONY = "BALCONY";
	public static final String SWIMMINGPOOL = "SWIMMINGPOOL";

  
private String Amenities;

	public Amenities(String amenities) {
		Amenities=amenities;
		
		// TODO Auto-generated constructor stub
	}
	public String getAm() {
		return Amenities;
	}
}
