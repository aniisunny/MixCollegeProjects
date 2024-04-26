package EPAM;

public class HouseConstruction {
	
	double areaOfHouse(double length, double breadth) {
		return length * breadth;
	}
	
	double constructionCost(double length, double breadth, String material) {
		material = material.toLowerCase();
		switch(material) {
			case "standard material": 
				return 1200 * areaOfHouse(length, breadth);
			case "above standard material":
				return 1500 * areaOfHouse(length, breadth);
			case "high standard material":
				return 1800 * areaOfHouse(length, breadth);
			case "high standard material and fully automated home":
				return 2500 * areaOfHouse(length, breadth);
			default:
				return 0.0;
		}
	}
}
