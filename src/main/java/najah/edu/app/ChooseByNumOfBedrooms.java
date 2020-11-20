package najah.edu.app;

public class ChooseByNumOfBedrooms implements CommonSpecification {

	private int numBedrooms;

	public ChooseByNumOfBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}
	
	public void setNumBedrooms(int num) {
		this.numBedrooms=num;
	}

	public int getNumBedrooms() {
		return numBedrooms;
	}

	public boolean isFound(TheFinder theFinder, int i) {
		return theFinder.homes.get(i).getNumOfBedrooms()==getNumBedrooms();
	}

	public int isCount(int count, int i, String[] splitCon,TheFinder f) {
		int numBed;
		if(splitCon[0].equalsIgnoreCase("bedrooms")) {
			numBed = Integer.parseInt(splitCon[1]);
			this.setNumBedrooms(numBed);
			if (this.isFound(f, i))
				count++;
		}
		return count;
	}
}
