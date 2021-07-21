import java.util.*;

public class Homework2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Hello. Please select program.");
        int selection = scan.nextInt();

    int size = 0;
    int power = 0;

        switch (selection) {
            case 1 -> {
                System.out.println("Please enter array size");
                size = scan.nextInt();
                ArrayList<Integer> array = genRandIntArrayList(size);
                int total = totalIntArrayList(array);
                System.out.println(array);
                System.out.println("Total = " + total);
            }
            case 2 -> {
                System.out.println("Please enter size and power");
                size = scan.nextInt();
                power = scan.nextInt();
                ArrayList<Integer> powerArray = toPower(size, power);
                System.out.println(powerArray);
            }
            default -> System.out.println("Goodbye.");
        }


    }


    static int randInt(int max, int min) {
        return (int) Math.floor((Math.random()) * (max - min) - min);
    }

    static ArrayList<Integer> genRandIntArrayList(int size) {
        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            array.add(randInt(1000, 1));
        }

        return array;
    }

    static int totalIntArrayList(ArrayList<Integer> array) {
        int total = 0;

        for (Integer num : array) {
            total += num;
        }

        return total;
    }

    static ArrayList<Integer> toPower(int size, int power) {
        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            array.add((int)Math.pow(i, power));
        }

        return array;
    }


}
