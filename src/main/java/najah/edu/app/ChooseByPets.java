package najah.edu.app;

public class ChooseByPets implements CommonSpecification {

	private String specification;

	public ChooseByPets(String specification) {
		this.specification = specification;
	}
	public void setSpecification(String specification) {
		this.specification=specification;
	}
	public String getSpecification() {
		return specification;
	}

	public boolean isFound(TheFinder theFinder, int i) {
		return theFinder.homes.get(i).getPet().equalsIgnoreCase(getSpecification());
	}

	public int isCount(int count, int i, String[] splitCon, TheFinder f) {
		if(splitCon[0].equalsIgnoreCase("pets")) {
			this.setSpecification(splitCon[1]);
			if(this.isFound(f, i)) 
				count++;
		}
		return count;
	}
}
