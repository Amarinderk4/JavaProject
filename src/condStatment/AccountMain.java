package condStatment;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
	
		Account ar =new Account();
		Scanner sc=new Scanner(System.in);
		ar.balanceAmount=5430.54;
		ar.overdraftAmount=1000;
		ar.pinNo=1234;
		
		System.out.println("Enter the pin number");
		
		ar.enteredPin= sc.nextInt();

		System.out.println("Enter the amount to withdraw");
		
		ar.withdrawAmount=sc.nextInt();
		
	    ar.validatePinWithdrawlCash();
		
		ar.atmWithdrawl();
		sc.close();
	}

	}


