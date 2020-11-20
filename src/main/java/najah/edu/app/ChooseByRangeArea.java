package najah.edu.app;

public class ChooseByRangeArea implements CommonSpecification {

	private int a1;
	private int a2;
	public ChooseByRangeArea(int a1, int a2) {
		this.a1 = a1;
		this.a2 = a2;
	}

	public void setArea(int num1,int num2) {
		this.a1=num1;
		this.a2=num2;
	}
	public int getA1() {
		return a1;
	}

	public int getA2() {
		return a2;
	}

	public boolean isFound(TheFinder theFinder, int i) {

		return (theFinder.homes.get(i).getArea() > getA1()) && (theFinder.homes.get(i).getArea()<getA2());
	}
	public int isCount(int count, int i, String[] splitCon,TheFinder f) {
		int rangeA1;
		int rangeA2;
		if(splitCon[0].equalsIgnoreCase("range of area")) {
			String[] rangeArea1=splitCon[1].split("-");
			rangeA1 = Integer.parseInt(rangeArea1[0]);
			rangeA2= Integer.parseInt(rangeArea1[1]);
			this.setArea(rangeA1, rangeA2);
			if (this.isFound(f, i))
				count++;
		}
		return count;
	}

}
