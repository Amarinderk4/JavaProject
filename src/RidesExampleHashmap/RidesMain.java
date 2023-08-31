package RidesExampleHashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class RidesMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<AllRides> listOfRides = new ArrayList<>();

		listOfRides.add(0, new AllRides(1100, "Carousal Ride"));
		listOfRides.add(1, new AllRides(2100, "Drop Tower"));
		listOfRides.add(2, new AllRides(3100, "Roller Coaster"));
		listOfRides.add(3, new AllRides(4100, "Flying Eagle"));
		listOfRides.add(4, new AllRides(5100, "Kiddie Ride"));

		List<Visitor> visitors = new ArrayList<>();

		visitors.add(new Visitor(100, "Raman"));
		visitors.add(new Visitor(200, "Deep"));
		visitors.add(new Visitor(300, "Aman"));

		HashMap<String, List<AllRides>> ridesAll = new HashMap<>();

		HashMap<String, List<Visitor>> names1 = new HashMap<>();

		ridesAll.put("AllRides", listOfRides);
		names1.put("Visitor", visitors);

		System.out.println("Enter the category");
		String enteredCategory = sc.next();

		List<AllRides> displayRides = ridesAll.get(enteredCategory);
		if (displayRides != null) {
			System.out.println(enteredCategory + "Rides :");
			for (AllRides allRides : displayRides) {
				System.out.println("Id number of Ride is:" + allRides.getId() + " " + "and " + "Names of the rides are:"
						+ allRides.getName());
			}
		} else {
			System.out.println("Category not found");
		}

		System.out.println("*************************");

		//HashMap<Integer, Supervisor> supers = new HashMap<>();
//			// supers.put(6101, new Supervisor(21,"Amanpreet","Operations"));
//
//			// int id=supers.get(6101).getId();
//			// System.out.println(id);

		for (AllRides allRides1 : visitors) {
			System.out.println("Visitors for the rides are:" + allRides1.getName());

		}

	}
}
