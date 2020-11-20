package najah.edu.app;

public class ChooseByLeaseLength implements CommonSpecification {

	private int leaseLength;

	public ChooseByLeaseLength(int leaseLength) {
		this.leaseLength = leaseLength;
	}
public void setLeaseLength(int num) {
	this.leaseLength=num;
}
	public int getLeaseLength() {
		return leaseLength;
	}

	public boolean isFound(TheFinder theFinder, int i) {
		return theFinder.homes.get(i).getLeaseLength()==getLeaseLength();
	}

	public int isCount(int count, int i, String[] splitCon,TheFinder f) {
		int lease;
		if(splitCon[0].equalsIgnoreCase("leaselength")) {
			lease = Integer.parseInt(splitCon[1]);
			this.setLeaseLength(lease);
			if (this.isFound(f, i))
				count++;
		}
		return count;
	}
}
