package condStatment;

public class SeniorCitizen {
int age=42;
	
	void validateAge() {
		if(age>=60)
		System.out.println("you are a senior citizen");
		
		else if(age>=50) 
			System.out.println("you are in your 50's");
		
		else if( age>=40)
			System.out.println("you are in your 40's");
			else
		{
			System.out.println("you are in your young age");
		}
	}
	
	

}
