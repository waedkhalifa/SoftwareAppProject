package najah.edu.app;
  
public class Type {

	public static final String APARTMENT = "APARTMENT";
	public static final String HOUSE = "HOUSE";

    private String typeName;
	public Type(String type) {
		typeName=type;
	}
	public String getTy() {
		return typeName;
	}
	
}
