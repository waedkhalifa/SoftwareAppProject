package najah.edu.app;

public class ChooseByArea implements CommonSpecification {

	private int area;

	public ChooseByArea(int area) {
		this.area = area;
	}
	public void setArea(int num) {
		this.area=num;
	}
	public int getArea() {
		return area;
	}

	public boolean isFound(TheFinder theFinder, int i) {
		return theFinder.homes.get(i).getArea()<getArea();
	}


	public int isCount(int count, int i, String[] splitCon,TheFinder f) {
		int ar;
		if(splitCon[0].equalsIgnoreCase("area")) {
			ar = Integer.parseInt(splitCon[1]);
			this.setArea(ar);
			if (this.isFound(f, i))
				count++;
		}
		return count;
	}
}
