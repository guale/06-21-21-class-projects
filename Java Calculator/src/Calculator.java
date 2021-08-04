public class Calculator {


	public static double add(double num1, double num2) {
		return num1 + num2;
	}

	public static double subtract(double num1, double num2) {
		return num1 - num2;
	}

	public static double multiply(double num1, double num2) {
		return num1 * num2;
	}

	public static double divide(double num1, double num2) {
		return num1 / num2;
	}

	public static double power(double num1, int num2) {
		double powered = 1;
		for (int i = 0; i < num2; i++) {
			powered *= num1;
		}
		return powered;
	}

	public static double squareRoot(double num) {
		return Math.sqrt(num);
	}

	public static double sin(double num) {
		return Math.sin(num);
	}

	public static double sinDegrees(double num) {
		num = Math.toDegrees(num);
		return Math.sin(num);
	}

	public static double cos(double num) {
		return Math.cos(num);
	}

	public static double cosDegrees(double num) {
		num = Math.toDegrees(num);
		return Math.cos(num);
	}

	public static double tan(double num) {
		return Math.tan(num);
	}

	public static double tanDegrees(double num) {
		num = Math.toDegrees(num);
		return Math.tan(num);
	}

	public static long factorial(int num) {
		long factorialed = num;
		for (int i = 0; i < num; i++) {
			factorialed *= (--num);
		}
		return factorialed;
	}
}
