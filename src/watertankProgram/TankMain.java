package watertankProgram;

public class TankMain {

	public static void main(String[] args) {

		WaterTank wt = new WaterTank();

		wt.bucketCapacity = 10;
		wt.initialLevel = 5;
		wt.totalCapacity = 100;
		wt.maximumCapacity = 95;

		wt.validateTankCapacity();

	}

}