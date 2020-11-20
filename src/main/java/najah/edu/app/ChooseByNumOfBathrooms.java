package najah.edu.app;

public class ChooseByNumOfBathrooms implements CommonSpecification {

	private int numBathrooms;

	public ChooseByNumOfBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}

	public void setNumBathrooms(int num) {
		this.numBathrooms=num;
	}
	public int getNumBathrooms() {
		return numBathrooms;
	}

	public boolean isFound(TheFinder theFinder, int i) {
		return theFinder.homes.get(i).getNumOfBathrooms()==getNumBathrooms();
	}
	
	public int isCount(int count, int i, String[] splitCon,TheFinder f) {
		int numBath;
		if(splitCon[0].equalsIgnoreCase("bathrooms")) {
			numBath = Integer.parseInt(splitCon[1]);
this.setNumBathrooms(numBath);
			if (this.isFound(f, i))
				count++;
		}
		return count;
	}
}
