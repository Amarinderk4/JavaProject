package assignment2;

public class ArithmOper2 {
	
	double no1= 22.5;
	double no2=12.5;
	double no3=45;
	double sum,sub,mul,div,mod;
	
	
	
	void addNumbers() {
    sum=no1+no2;
	System.out.println("Addition of " +no1+ " and  " +no2+ " is " +sum);
	}
    void subNumbers() {
    	sub=no1-no2;
    	System.out.println("subtraction  of " +no1+ " and  " +no2+ " is " +sub);
    }
	void mulNumbers() {
		mul=no1*no2;
		System.out.println("Multiplication of " +no1+ " and " +no2+ " is " +mul);
	}
	void divNumbers() {
		div=no1/no2;
		System.out.println("quotient of " +no1+ " and " +no2+ " is " +div);
		mod=no1%no2;
		System.out.println("remainder of " +no1+ " and " +no2+ " is " +mod);
		
		
	}
	void sumaddNumber() {
		sum=no1+no2+no3;
		System.out.println("Addition of " +no1+ " and  " +no2+ " is " +sum);
		}

}
