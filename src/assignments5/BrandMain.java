package assignments5;

import java.util.Scanner;

public class BrandMain {

	public static void main(String[] args) {
		BrandName phones = new BrandName();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the brand name:");
		String name = sc.next();

		phones.addPhoneNames();
		phones.populateNames();
		phones.findBrandName();
		sc.close();
	}

}
