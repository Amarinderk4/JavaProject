package assignment4;

// Ans1:There are 3 components of the loops are: starting point,ending point and interval that how many times it should repeat.

//Ans2: Break statement is used to come outside (terminates)  the loop and then the program moves to the next statement.  

public class WaterTank {

	int tankCapacity;
	int bucketCapacity;
	int currentLevel;

	void validateWaterCapacity() {

		while (currentLevel + bucketCapacity <= tankCapacity) {
			bucketCapacity += 10;

			System.out.println("Total tank filled is : " + bucketCapacity);

			if (currentLevel + bucketCapacity == tankCapacity) {

				break;
			}

		}

	}
}
