package exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// BEGIN
class App {

	public static List buildApartmentsList(List apartments, int limit) {
		if (apartments.isEmpty()) {
			return apartments;
		}
		Collections.sort(apartments, Comparator.comparingDouble(Home::getArea));
		List<String> resultApartments = new ArrayList<>();
		apartments.subList(0, limit);
		for (int i = 0; i < limit; i ++) {
			resultApartments.add(apartments.get(i).toString());
		}

		return resultApartments;
	}

}
// END
