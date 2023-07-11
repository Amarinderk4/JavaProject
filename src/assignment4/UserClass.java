package assignment4;

import java.util.Scanner;

public class UserClass {

	String userId;
	String enteredUserId;
	String password;
	String enteredPassword;
	int attempts = 0;

	Scanner sc = new Scanner(System.in);

	void validateAuthentication() {
		while (attempts < 3) {

			attempts++;
			System.out.println(attempts);

			if ((enteredUserId.equals(userId)) && (enteredPassword.equals(password))) {

				System.out.println("You are logged into the application");
				break;
			}

			else {

				System.out.println("Enter the username: ");
				enteredUserId = sc.next();
				System.out.println("Enter the password: ");
				enteredPassword = sc.next();

				System.out.println("incorrect userId and password.Try Again");
			}
		}

		if (attempts == 3) {

			System.out.println("Account is locked");

		}
	}

}
