package assignment4;

public class TankMain {

	public static void main(String[] args) {

		WaterTank wt = new WaterTank();

		wt.bucketCapacity = 5;
		wt.tankCapacity = 100;
		wt.currentLevel = 10;

		wt.validateWaterCapacity();

	}

}
