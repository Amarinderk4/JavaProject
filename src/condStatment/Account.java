package condStatment;

public class Account {
	
	double balanceAmount;
	int withdrawAmount;
	int overdraftAmount;
	int pinNo;
	int enteredPin;
	
	//if customer has enough balance (balanceAmount>withdrawAmount)
	//OR
	//if the customer has enough overdraft(overdraftAmount>withdrawAmount)
	
	void atmWithdrawl() {
		if(balanceAmount>=withdrawAmount ||overdraftAmount>=withdrawAmount) {
			
System.out.println("customer can withdraw the cash");

	} 
	else{
		System.out.println("Not enough cash");
	}
	}
	
	//if line no 30 is not correct it will go to line no 41 because this  if block ends on line no 31
	//if line no 34 is not correct it will go to line no 37
	
	void validatePinWithdrawlCash() {
		if(enteredPin==pinNo) {
			System.out.println("correct pin number");
		
	 if(balanceAmount>=withdrawAmount ||overdraftAmount>=withdrawAmount) {
    	
		System.out.println("customer can withdraw cash");
	}else {
	System.out.println("not enough cash");
	}
	
	}else
{
	System.out.println("Invalid pin");
}}
}

