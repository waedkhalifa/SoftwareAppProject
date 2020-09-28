package najah.edu.app;

import java.util.List;

public class Home {
	private Type type; 
	private Material material; 
	private Placement placement; 
	private Pets pets; 
	private Amenities amenities; 
	private int price; 
	private int area; 
	private int numOfBedrooms; 
	private int numOfBathrooms; 
	private int LeaseLength; 

	public Home(Type type, Material material,Placement placement, Pets pets,Amenities amenities,
			int price, int area, int numOfBedrooms , int numOfBathrooms,
			int LeaseLength ) { 
		super(); 
		this.type = type; 
		this.material = material; 
		this.placement = placement; 
		this.pets = pets; 
		this.amenities= amenities; 
		this.price = price; 
		this.area = area; 
		this.numOfBedrooms = numOfBedrooms; 
		this.numOfBathrooms = numOfBathrooms; 
		this.LeaseLength = LeaseLength; 
		
	}

	@Override public String toString() {
		return "{Type=" + type.getType() + ",Material=" + material.getMaterial() +
				 ", Placement=" + placement.getPlacement() + ", Pets=" + pets.getPets() +
				  ", Amenities=" + amenities.getAmenities() + ", Price=" + price + ",Area=" + area + 
				  ", Number of bedrooms=" + numOfBedrooms + ", Number of bathrooms=" + numOfBathrooms
				  + ", Lease length=" + LeaseLength +"}";

				
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
	

	public Pets getPet() {
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
		return LeaseLength;
	}
	
	
	
}
