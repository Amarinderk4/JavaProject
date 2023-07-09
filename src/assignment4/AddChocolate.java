package assignment4;

public class AddChocolate {

	int chocolates;
	int addedChocolates;

	void validateTotalChocolate() {
		while (chocolates<=addedChocolates) {
			if (chocolates == 63) {
				break;
			}

			System.out.println("Added 5 , Total chocolates: " +chocolates);
			chocolates += 5;

		}
	}

}
