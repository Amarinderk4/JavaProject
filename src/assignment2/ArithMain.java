package assignment2;

public class ArithMain {

	public static void main(String[] args) {
		
	ArithmOper2 ao2 =new ArithmOper2();
		ao2.addNumbers();
		ao2.subNumbers();
		ao2.mulNumbers();
		
		
		System.out.println("Reassigning the values******");
		 ao2.no1=15.3;
		 ao2.no2=23.4;
		 ao2.addNumbers();
			ao2.subNumbers();
			ao2.mulNumbers();
			
			
			System.out.println("Reassigning the values again*****************");
			 ao2.no1=35.3;
			 ao2.no2=12.2;
			 ao2.addNumbers();
				ao2.subNumbers();
				ao2.mulNumbers();
				
		
			
		
		/*
		eo.add5Numbers();
		eo.minus5Numbers();
		eo.mul5Numbers();
		eo.divideBy5Numbers();
		eo.mod5Numbers();*/

	}



	}


