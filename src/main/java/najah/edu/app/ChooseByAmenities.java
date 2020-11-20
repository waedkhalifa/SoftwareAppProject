package najah.edu.app;

public class ChooseByAmenities {

	private String[] specification;

	public ChooseByAmenities(String[] specification) {
		this.specification = specification;
	}

	public String[] getSpecification() {
		return specification;
	}

	boolean isFoundAm(TheFinder theFinder, int i, int q) {
		return theFinder.homes.get(i).getAmenities().getAm().contains(getSpecification()[q]);
	}
	
	public int isCount(int count, String[] splitCon,TheFinder f) {
		if(splitCon[0].equalsIgnoreCase("amenities")) {
			String[] splitAmenities2=splitCon[1].split("-");
			if(!(f.byAmenities(splitAmenities2).isEmpty()))
				count++;
		}
		return count;
	}
}
