package watertankProgram;

public class WaterTank {

	int initialLevel;
	int totalCapacity;
	int maximumCapacity;
	int bucketCapacity;

	void validateTankCapacity() {

		while (initialLevel <= maximumCapacity) {

			if (initialLevel + bucketCapacity <= maximumCapacity) {

				initialLevel += bucketCapacity;

				System.out.println("Total tank capacity is : " + initialLevel);
			}

			if (initialLevel == totalCapacity) {

				System.out.println("Water tank reaches to highest level");

				break;
			}
		}

		if (initialLevel > totalCapacity) {

			System.out.println("Water alert");

		}

	}
}
