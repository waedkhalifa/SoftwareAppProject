package najah.edu.app;

public class ChooseByType implements CommonSpecification {

	private String specification;

	public ChooseByType(String specification) {
		this.specification = specification;
	}
	public void setSpecification(String specification) {
		this.specification=specification;
	}
	public String getSpecification() {
		return specification;
	}

	@Override
	public boolean isFound(TheFinder theFinder, int i) {
		return theFinder.homes.get(i).getType().getTy().equalsIgnoreCase(getSpecification());
	}


	public int isCount(int count, int i, String[] splitCon, TheFinder f) {
		if(splitCon[0].equalsIgnoreCase("type")) {
			this.setSpecification(splitCon[1]);
				if(this.isFound(f, i)) 
					count++;
			}
		return count;
	}

}
