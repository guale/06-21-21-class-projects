package vehicle;

public class Car {

	private static final int MAX_DOORS = 6;
	private static final int MIN_DOORS = 1;

	public Car(String color, int numberOfDoors) {
		this.color = color;
		this.numberOfDoors = numberOfDoors;
	}

	//fields:
	//color
	//amount of doors

	private String color;
	private int numberOfDoors;

	private int speed;
	private int currentRPM;

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public int getCurrentRPM() {
		return currentRPM;
	}

	private void setCurrentRPM(int rpm) {
		currentRPM = rpm;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
		setCurrentRPM(calculateRPM(speed));
	}

	private int calculateRPM(int speed) {
		int rpm = speed * 1000;
		return rpm;
	}
	//methods:
	//it can start
	//it can drive
	//it can stop

	public void start() {
		System.out.println("Vroom vroom");
	}

	public void drive() {
		System.out.println("Goota go fast");
	}

	public void stop() {
		System.out.println("Screeeeeee");
	}

}
