package assignment1;

public class LaptopMain {

	public static void main(String[] args) {
		
		Laptop hp= new Laptop();
		//Assigning values to  variables
		
		hp.laptopName=" HP Pavilion";
		hp.processor="intel i17";
		hp.screenSize=15.6;
		hp.storageCapacity="1 TB";
		hp.isCameraPresent=true;
		
		Laptop asus= new Laptop();
		asus.laptopName="ASUS HD";
		asus.processor= "intel Celeron N4020";
		asus.screenSize=14;
		asus.storageCapacity="64GB";
		asus.isCameraPresent=true;
		
		//calling the method
		hp.sendEmail();
		hp.takePictures();
		asus.sendEmail();
		asus.takePictures();
		
	

	}

}
