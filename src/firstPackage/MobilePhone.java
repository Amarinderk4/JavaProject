package firstPackage;

public class MobilePhone {
	
	String brandName;
	 int modelNumber;
	 double screenSize;
	 int storageCap;
	 String operatingSyst;
	 boolean isCameraPresent;
	 
	 void makeCalls() {
		 System.out.println("i am making calls from my phone" );
	 }

	 void sendTextMessage() {
		 
		 System.out.println("i am sending text messages" +brandName+modelNumber);
		 
	 }
    void takePictures() {
    	System.out.println("taking pics");
    }

    
}

