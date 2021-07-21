import java.util.*;

public class Homework {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello. Please select program.");
        int selection = scan.nextInt();


        switch (selection) {
            case 1 -> listExercise();
            case 2 -> hashExercise();
            default -> System.out.println("Goodbye.");
        }
    }

    static void listExercise() {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> intList = new ArrayList<>();

        System.out.println("Please enter five integers separated by spaces.");
        for (int i = 0; i < 5; i++) {
            int num = scan.nextInt();
            intList.add(num);
        }

        System.out.println(intList);

        int sum = 0;

        for (Integer num : intList) {
            sum += num;
        }

        System.out.println("The sum is " + sum);

        long product = 1;

        for (Integer num : intList) {
            product *= num;
        }

        System.out.println("The product is " + product);

        System.out.println("The largest number is " + Collections.max(intList));
        System.out.println("The smallest number is " + Collections.min(intList));
    }

    static void hashExercise() {
        Scanner scan = new Scanner(System.in);

        HashMap<String, String> car = new HashMap<>();

        car.put("Civic", "Honda");
        car.put("Rogue", "Nissan");
        car.put("Tacoma", "Toyota");

        System.out.println("What kinda car you want?");
        String model = scan.nextLine();

        String make = car.get(model);

        if (make != null) {

            System.out.printf("You want a %s? The %ss are over there.", model, make);
        } else {
            System.out.println("We don't got those.");
        }

    }
}
