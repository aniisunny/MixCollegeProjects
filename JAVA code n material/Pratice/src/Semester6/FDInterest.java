package Semester6;

import java.util.ArrayList;
import java.util.List;

class FDInterestCrore {
	String maturityPeriod;
	double general, seniorCitizen, rate;

	public FDInterestCrore(String m, double general, double senior, double rate) {
		this.maturityPeriod = m;
		this.general = general;
		this.seniorCitizen = senior;
		this.rate = rate;
	}
}

public class FDInterest {

	List<FDInterestCrore> list;

	List<FDInterestCrore> dataFD() {
		list = new ArrayList<>();
		list.add(new FDInterestCrore("007-014", 4.50, 5.00, 6.50));
		list.add(new FDInterestCrore("015-029", 4.75, 5.25, 6.75));
		list.add(new FDInterestCrore("030-045", 5.50, 6.00, 6.75));
		list.add(new FDInterestCrore("045-060", 7.00, 7.50, 8.00));
		list.add(new FDInterestCrore("061-184", 7.50, 8.00, 8.50));
		list.add(new FDInterestCrore("184-365", 8.00, 8.50, 10.00));
		return list;
	}

	double fetchInterest(int days, double amount, int age) {

		dataFD();
		int i = 0;
		for (; i < list.size(); i++) {
			int start = Integer.parseInt(list.get(i).maturityPeriod.substring(0, 3));
			int end = Integer.parseInt(list.get(i).maturityPeriod.substring(4, 7));
			if (days > start && days < end)
				break;
		}
		if (amount > Math.pow(10, 7))
			return list.get(i).rate;
		else {
			if (age <= 50)
				return list.get(i).general;
			else
				return list.get(i).seniorCitizen;
		}
	}
}
