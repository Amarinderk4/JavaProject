package RidesExampleHashmap;

public class Visitor extends AllRides {

	public Visitor(int id, String name) {
		super(id, name);

	}

	public String getName() {
		return name;
	}

	public void validateRide() {
		System.out.println("ride are available ");
	}

}
