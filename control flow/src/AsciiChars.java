public class AsciiChars {
	public static void printNumbers() {
		for (int i = 48; i < 58; i++){
			char num = (char) i;
			System.out.print(num + " ");
		}
		System.out.println("");
	}

	public static void printLowerCase() {
		for (int i = 97; i < 123; i++){
			char num = (char) i;
			System.out.print(num + " ");
		}
		System.out.println("");
	}

	public static void printUpperCase(){
		for (int i = 65; i < 91; i++){
			char num = (char) i;
			System.out.print(num + " ");
		}
		System.out.println("");
	}
}
