package assignment1;

public class Laptop {
	
	String laptopName;
    String processor;
     int modelNumber;
	double screenSize;
	String storageCapacity;
	boolean isCameraPresent;
	
	void takePictures()
	{
		System.out.println(" I am Taking Picutres from" +laptopName+processor);
	}
	
	void sendEmail() {
		System.out.println("I can send emails from" +laptopName);
	}
	
	

}
