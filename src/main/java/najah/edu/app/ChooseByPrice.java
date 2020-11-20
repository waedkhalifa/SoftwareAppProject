package najah.edu.app;

public class ChooseByPrice implements CommonSpecification {

	private int price;

	public ChooseByPrice(int price) {
		this.price = price;
	}
	public void setPrice(int num) {
		this.price=num;
		}
	public int getPrice() {
		return price;
	}

	public boolean isFound(TheFinder theFinder, int i) {
		return theFinder.homes.get(i).getPrice()<getPrice();
	}


	public int isCount(int count, int i, String[] splitCon,TheFinder f) {
		int pr;
		if(splitCon[0].equalsIgnoreCase("price")) {
			pr = Integer.parseInt(splitCon[1]);
			this.setPrice(pr);
			if (this.isFound(f, i))
				count++;
		}
		return count;
	}
}
