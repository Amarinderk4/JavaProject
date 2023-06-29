package javaOperators;

public class AssignmentOperators {
	
	int age=33;
	
	void ageAfer5Years() {
		age += 5;
		System.out.println("Age after 5 years= " +age);
		
	}
	void ageBefore10Yeras() {
		age -=10;
		System.out.println("Age before 10 years = "+age);
		
	}
	void ageMultiply5Years() {
		age *=5;
		System.out.println("Age multiply by 5 years = "+age);
	}
     void agedivide5Years() {
    	 age /=5;
    	 System.out.println("Age divive by 5 years =" +age);
     }
     void ageModulus5Years() {
    	 age %=5;
    	 System.out.println("Age modulus by 5 years =" +age);
     }
}
