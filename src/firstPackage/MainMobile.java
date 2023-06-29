package firstPackage;

public class MainMobile {

	public static void main(String[] args) {
	//Instantiating a class OR creating an object
		
		MobilePhone iPhone= new MobilePhone();
		//Assigning values to variables
		iPhone.brandName="IPhone";
		iPhone.modelNumber=14;
		iPhone.screenSize=7.2;
		iPhone.isCameraPresent=true;
		//Instantiating a class
		MobilePhone samsung= new MobilePhone();
		//Assigning values to a variables
		samsung.brandName="Samsung";
		samsung.modelNumber=22;
		samsung.screenSize=7.5;
		samsung.isCameraPresent=true;
		
		//calling the method or invoking the method
		
		iPhone.makeCalls();
		iPhone.sendTextMessage();
		iPhone.takePictures();
		samsung.makeCalls();
		
		
	    
		

	}

}
