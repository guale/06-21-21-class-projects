import java.util.ArrayList;
import java.util.LinkedList;
import vehicle.Car;

public class Main {
	public static void main(String[] args){
		ArrayList<String> arrayList = new ArrayList<>();
		LinkedList<String> linkedList = new LinkedList<>();

		arrayList.add("Hello");
		arrayList.add("World");

		System.out.println(arrayList.size());

		Car car = new Car("blue", 3);

		car.start();
		car.drive();

		ArrayList<Integer> integers = null;
		System.out.println(integers);

	}
}
