package assignments5;

import java.util.Scanner;

public class BrandName {

	String[] phoneName = { "samsung", "google", "apple" };

	String[] samsungArray = new String[4];
	String[] googleArray = new String[4];
	String[] iphoneArray = new String[4];

	String brandName;

	void addPhoneNames() {
		samsungArray[0] = "S20";
		samsungArray[1] = "S21";
		samsungArray[2] = "Flip3";
		samsungArray[3] = "Fold3";

		googleArray[0] = "GooglePixel6";
		googleArray[1] = "GooglePixel6 Pro";
		googleArray[2] = "GooglePixel Pro";
		googleArray[3] = "GooglePixel5";

		iphoneArray[0] = "IPhone12";
		iphoneArray[1] = "IPhone12 mini";
		iphoneArray[2] = "IPhone11";
		iphoneArray[3] = "IPhone11";

	}

	void populateNames() {

		for (int i = 0; i < samsungArray.length; i++) {
			System.out.println(samsungArray[i]);

		}
	}

	void findBrandName() {
		Scanner sc = new Scanner(System.in);
		// String brandName;
		brandName = sc.next();
		

		for (int i = 0; i < samsungArray.length; i++) {
			if (brandName.equalsIgnoreCase("samsung")) {
				System.out.println(samsungArray[i]);
			}
			for (int j = 0; j < samsungArray.length; j++) {
				if (brandName.equalsIgnoreCase("google")) {
					System.out.println(googleArray[j]);
				}
			}
			for (int k = 0; k < samsungArray.length; k++) {
				if (brandName.equalsIgnoreCase("apple")) {
					System.out.println(iphoneArray[k]);
				}

				else {
					System.out.println("Invalid brand name");
					break;
				}

			}
		}
	}
}
