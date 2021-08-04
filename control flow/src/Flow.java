import java.util.*;

public class Flow {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		AsciiChars.printNumbers();
		AsciiChars.printLowerCase();
		AsciiChars.printUpperCase();
		enterName();
		System.out.println("Would you like to complete survey? y/n");
		String response = scan.next();
		response = response.toLowerCase();
		if (response.equals("y") || response.equals("yes")) {
			Survey.begin();
		} else {
			System.out.println("Thank you, come again");
		}

	}

	public static void enterName() {
		System.out.println("Please enter your name.");
		String name = scan.nextLine();
		System.out.println("Hello " + name);
	}
}
