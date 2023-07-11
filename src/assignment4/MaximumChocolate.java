package assignment4;

public class MaximumChocolate {

	int chocolates;
	int totalChocolates;

	void validateTotalChocolate() {
		while (chocolates < totalChocolates) {
			if (chocolates == totalChocolates) {
				break;
			}

			System.out.println("Total chocolates: " + chocolates);

			chocolates += 5;

		}
	}

}
