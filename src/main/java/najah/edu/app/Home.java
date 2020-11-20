package najah.edu.app;
  
public class Home {
	private Type type; 
	private Material material; 
	private Placement placement; 
	private String pets; 
	private Amenities amenities; 
	private int price; 
	private int area; 
	private int numOfBedrooms; 
	private int numOfBathrooms; 
	private int leaseLength; 


	public Home() { 
/*		
 replace old constructor with 10 parameters, with this empty constructor
 and set methods */
		
	}

public void setType(Type type) {
	this.type=type;
}
public void setMaterial(Material material) {
	this.material=material;
}
public void setPlacement(Placement placement) {
	this.placement=placement;
}
public void setPets(String pets) {
	this.pets=pets;
}
public void setAmenities(Amenities amenities) {
	this.amenities=amenities;
}
public void setPrice(int price) {
	this.price=price;
}
public void setArea(int area) {
	this.area=area;
}
public void setNumOfBedrooms(int numOfBedrooms) {
	this.numOfBedrooms=numOfBedrooms;
}
public void setNumOfBathrooms(int numOfBathrooms) {
	this.numOfBathrooms=numOfBathrooms;
}
public void setLeaseLength(int leaseLength) {
	this.leaseLength=leaseLength;
}

	@Override
	public String toString() {
		return "{Type=" + type.getTy() + ", Material=" + material.getMa() +
				 ", Placement=" + placement.getPl() + ", Pets=" + pets +
				  ", Amenities=" + amenities.getAm() + ", Price=" + price + ", Area=" + area + 
				  ", Number of bedrooms=" + numOfBedrooms + ", Number of bathrooms=" + numOfBathrooms
				  + ", Lease length=" + leaseLength +"}";

				
	}
	
	
	public Type getType() {
		return type;
	}
	
	public Material getMaterial() {
		return material;
	}
	
	public Placement getPlacement() {
		return placement;
	}
	

	public String getPet() {
		return pets;
	}
	
	public Amenities getAmenities(){
		return amenities;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getArea() {
		return area;
	}
	
	
	public int getNumOfBedrooms() {
		return numOfBedrooms;
	}
	
	public int getNumOfBathrooms() {
		return numOfBathrooms;
	}
	
	public int getLeaseLength() {
		return leaseLength;
	}
	
	
	
}
