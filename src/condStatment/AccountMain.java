package condStatment;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
	
		Account ar =new Account();
		Scanner sc=new Scanner(System.in);
		ar.balanceAmount=5430.54;
		ar.overdraftAmount=1000;
		System.out.println("Enter the amount to withdraw");
		ar.withdrawAmount=sc.nextInt();
		ar.atmWithdrawl();
		

	}

}
