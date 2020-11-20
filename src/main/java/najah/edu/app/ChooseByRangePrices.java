package najah.edu.app;

public class ChooseByRangePrices implements CommonSpecification {

	private int p1;
	private int p2;

		
	public ChooseByRangePrices(int p1, int p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	public void setPrices(int num1, int num2) {
		this.p1 = num1;
		this.p2 = num2;
	}
	public int getP1() {
		return p1;
	}

	public int getP2() {
		return p2;
	}

	public boolean isFound(TheFinder theFinder, int i) {
		return (theFinder.homes.get(i).getPrice() > getP1()) && (theFinder.homes.get(i).getPrice()<getP2());
	}

	public int isCount(int count, int i, String[] splitCon,TheFinder f) {
		int rangeP1;
		int rangeP2;
		if(splitCon[0].equalsIgnoreCase("range of price")) {
			String[] rangePrice1=splitCon[1].split("-");
			rangeP1 = Integer.parseInt(rangePrice1[0]);
			rangeP2= Integer.parseInt(rangePrice1[1]);
			this.setPrices(rangeP1, rangeP2);
			if (this.isFound(f, i))
				count++;
		}
		return count;
	}
}
