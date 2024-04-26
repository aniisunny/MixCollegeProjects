package String;

public class SplitString {

	public static void main(String[] args) {
		
		String place = "74km NW of Rumoi, Japan";
		//String place1 = "Pacific-Antarctic Ridge";
		if(place.contains("of")) {
			String[] splitArray = place.split("of");
			splitArray[0] += "of";
			splitArray[1] = splitArray[1].trim();
			for(String str :splitArray) 
				System.out.println(str);
		}
		else {
			String locationOffset = "Near the";
			String location = place;
			System.out.println(locationOffset);
			System.out.println(location);
		}
		
		int index = place.indexOf("of");
		System.out.println(index);
		if(index == -1) {
			String locationOffset = "Near the";
			String location = place;
			System.out.println(locationOffset);
			System.out.println(location);
		}
		else {
			String locationOffset = place.substring(0, 8);
			String location = place.substring(index + 3);
			System.out.println(locationOffset);
			System.out.println(location);
		}

	}

}
