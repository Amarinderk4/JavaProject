package condStatment;

public class Account {
	
	double balanceAmount;
	int withdrawAmount;
	int overdraftAmount;
	
	void atmWithdrawl() {
		if(balanceAmount>withdrawAmount ||overdraftAmount>withdrawAmount) {
System.out.println("customer can withdraw the cash");
	} 
	else
	{
		System.out.println("Not enough cash");
	}

	}
}
