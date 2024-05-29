package wordpresstest;

public class LogicOOP {
	public static String[] house1 = {"American", "Yellow", "Cat", "Water", "Oppo"};
	public static String[] house2 = {"Indian", "Blue", "Horse", "Tea", "Desktop"};
	public static String[] house3 = {"Filipino", "Red", "Bird", "Milk", "Laptop"};
	public static String[] house4 = {"German", "Green", "Fish", "Coffee", "Tablet"};
	public static String[] house5 = {"Korean", "White", "Dogs", "Rootbeer", "Iphone"};
	    
	public static void main(String[] args) {
		System.out.print("House 1: ");
		for (int i = 0; i < 5; i++) {
			System.out.print(house1[i]);
			if (i != 4) {
				System.out.print(",");
			}
			System.out.print(" ");
		}
		
		System.out.println(" ");
		System.out.print("House 2: ");
		for (int i = 0; i < 5; i++) {
			System.out.print(house2[i]);
			if (i != 4) {
				System.out.print(",");
			}
			System.out.print(" ");
		}
		System.out.println(" ");
		System.out.print("House 3: ");
		for (int i = 0; i < 5; i++) {
			System.out.print(house3[i]);
			if (i != 4) {
				System.out.print(",");
			}
			System.out.print(" ");
		}
		System.out.println(" ");
		System.out.print("House 4: ");
		for (int i = 0; i < 5; i++) {
			System.out.print(house4[i]);
			if (i != 4) {
				System.out.print(",");
			}
			System.out.print(" ");
		}
		System.out.println(" ");
		System.out.print("House 5: ");
		for (int i = 0; i < 5; i++) {
			System.out.print(house5[i]);
			if (i != 4) {
				System.out.print(",");
			}
			System.out.print(" ");
		}
		System.out.println(" ");
		System.out.println("The German owns the fish.");
		
	}
}

