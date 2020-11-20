package najah.edu.app;
  
public class Material {

	public static final String BRICK = "BRICK";
	public static final String WOOD = "WOOD";
	public static final String STONE = "STONE";
	
    private String materialName;

	public Material(String material) {
		materialName=material;
	}
	public String getMa() {
		return materialName;
	}
	
}
