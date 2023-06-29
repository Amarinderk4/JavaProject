package assignment2;

public class DoubleAssign {
	
	double age=32.5;
	
	void ageAfter5yr() {
		age +=5;
		System.out.println(" total age of a person =" +age);
	}
	void ageBefore5yr() {
		age -=5;
		System.out.println(" total age of a person before 5 yr  =" +age);
	}
	void ageMul5yr() {
		age *=5;
		System.out.println(" total age of a person after multiplying ny 5=" +age);
	}
	void ageDiv5yr() {
		age /=5;
		System.out.println(" total age of a person after dividing by 5 =" +age);
	}
	void ageMod5yr() {
		age %=5;
		System.out.println(" total age of a person after modulus by 5  =" +age);
	}

}
