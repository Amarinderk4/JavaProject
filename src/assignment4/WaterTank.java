package assignment4;

// Ans1:There are 3 components of the loops are: starting point,ending point and interval that how many times it should repeat.

//Ans2: Break statement is used to come outside (terminates)  the loop and then the program moves to the next statement.  

public class WaterTank {

	int tankCapacity;
	int bucketCapacity;

	void validateWaterCap() {

		while (bucketCapacity <= tankCapacity) {
			if (bucketCapacity == tankCapacity) {
				break;
			}
			System.out.println(bucketCapacity);

			bucketCapacity += 10;

		}

	}
}
