package condStatment;

import java.util.Scanner;

public class SeniorMain {

	public static void main(String[] args) {
		
	SeniorCitizen ds = new SeniorCitizen();
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter the age");
	
	ds.age=sc.nextInt();
	
	ds.validateAge();
	
	sc.close();
	
		

	}



}
