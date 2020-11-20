package najah.edu.app;

public class ChooseByPlacement implements CommonSpecification {

	private String specification;

	public ChooseByPlacement(String specification) {
		this.specification = specification;
	}
	public void setSpecification(String specification) {
		this.specification=specification;
	}
	public String getSpecification() {
		return specification;
	}

	public boolean isFound(TheFinder theFinder, int i) {
		return theFinder.homes.get(i).getPlacement().getPl().equalsIgnoreCase(getSpecification());
	}

	public int isCount(int count, int i, String[] splitCon, TheFinder f) {
		if(splitCon[0].equalsIgnoreCase("placement")) {
			this.setSpecification(splitCon[1]);
			if(this.isFound(f, i)) 
				count++;
		}

		return count;
	}
}
