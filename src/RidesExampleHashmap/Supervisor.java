package RidesExampleHashmap;

public class Supervisor extends AllRides {

	String shift;

	public Supervisor(int id, String name, String shift) {
		super(id, name);
		this.shift = shift;

	}

	public void provideShifts() {
		System.out.println("provide working routine for the employees");
	}

}
