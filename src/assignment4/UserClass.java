package assignment4;

public class UserClass {

	String userId;
	String enteredUserId;
	String password;
	String enteredPassword;
	int attempts = 0;// how many times it counts

	void validateAuthentication() {
		while (attempts < 3) {

			attempts++;

			System.out.println(+attempts);

			if ((enteredUserId.equals(userId)) && (enteredPassword.equals(password))) {

				System.out.println("You are logged into the application");
				break;
			}

			else {
				System.out.println("incorrect userId and password.Try Again");

			}

			if (attempts == 3) {

				System.out.println("Account is locked");

			}
		}

	}
}
