import java.util.*;


public class classwork {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

/*        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(9);

        System.out.println(arrayList.get(1));*/

/*        String myString = "I really love icecream!";

        String[] str = myString.split(" ");

        List<String> arrayString = new ArrayList<String>();

        arrayString = Arrays.asList(str);

        System.out.println(arrayString);*/

/*        HashMap<String, Integer> person = new HashMap<>();

        person.put("Joan", 21);
        person.put("Anna", 34);
        person.put("Mike", 55);
        person.put("daniel", 42);

        System.out.println(person.get("Joan"));*/

/*        ArrayList<String> array = new ArrayList<>();
        array.add("Honda");
        array.add("Toyota");
        array.add("Ford");
        for (String car : array) {
            System.out.println(car);
        }*/

        System.out.println("Hello. Please select program.");
        int selection = scan.nextInt();

        switch (selection) {
            case 1 -> listExercise();
            case 2 -> hashExercise();
            default -> System.out.println("Goodbye.");
        }

    }

    static void listExercise() {

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

        int product = 1;

        for (Integer num : intList) {
            product *= num;
        }

        System.out.println("The product is " +product);

        System.out.println("The largest number is " + Collections.max(intList));
        System.out.println("The smallest number is " + Collections.min(intList));
    }

    static void hashExercise() {

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
