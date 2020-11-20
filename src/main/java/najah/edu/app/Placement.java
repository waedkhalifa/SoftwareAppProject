package najah.edu.app;
  
public class Placement {
	public static final String CITY = "CITY";
	public static final String VILLAGE = "VILLAGE";

	private String placementName;
	
	public Placement(String placement) {
			placementName=placement;
		}
		public String getPl() {
			return placementName;
		}
}
