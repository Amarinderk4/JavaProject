package assignment2;

public class EqualsToOperator {
	
	int age=35;
	
	
	void ageAfter10Years() {
		age +=10;
		System.out.println("Total age after 10 years is " +age);
	}
	
	void ageBefor10Years() {
		age -=10;
		System.out.println("Total age before 10years  "+age);
	}
	void ageMul10Years() {
		age *=10;
		System.out.println("Total age agter multiplying by 10 is  =" +age);
	}
	
	void agedivBy10Yeras() {
		age /=10;
		System.out.println("Total age after division  by 10 is  =" +age);
	}
	void agemod10Yeras() {
		age %=10;
		System.out.println("Total age after modulus   =" +age);
	}

	}

