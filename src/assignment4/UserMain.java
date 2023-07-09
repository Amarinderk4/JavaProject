package assignment4;

import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		
		UserClass login=new UserClass();
		Scanner sc =new Scanner(System.in);
		login.userId="pivotAdmin";
		login.password="Admin123";
		
		System.out.println("Enter the username");
		login.enteredUserId =sc.next();
		
		
		System.out.println("Enter the password");
		login.enteredPassword=sc.next();
		
		login.validateAuthentication();
		sc.close();
		

	}

}
