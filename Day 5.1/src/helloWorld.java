import java.util.Scanner;

public class helloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //        System.out.println("Hello world!");
/*            System.out.println("What is your name?");
            String firstName = input.nextLine();
            System.out.printf("Hello %s!\n", firstName);
            System.out.printf("Goodbye %s\n", firstName);*/

/*        System.out.println("Please enter a name?");
        String name = input.nextLine();
        System.out.println("Please Enter an adverb.");
        String adverb = input.nextLine();
        System.out.println("Please Enter an adjective.");
        String adjective = input.nextLine();
        System.out.println("Please Enter a noun.");
        String noun1 = input.nextLine();
        System.out.println("Please Enter a second noun.");
        String noun2 = input.nextLine();
        System.out.println("Please Enter a number.");
        String num = input.nextLine();
        System.out.println("Please Enter your name.");
        String yName = input.nextLine();

        System.out.printf("""
                        Dear %s,

                         You are %s %s and I want to be your %s!I want to go to the %s with you in %s days.\s

                         Sincerely, %s""",
                name, adverb, adjective,noun1,noun2,num,yName);*/

/*        int guess = 0;
        int number = 69;
        System.out.println("What is your guess?");
        guess = Integer.parseInt(input.nextLine());

        if (guess == number) {
            System.out.println("Wow!");
        } else {
            System.out.println("Nope!");
        }*/

        System.out.println("What's your favorite animal?");
        String animal = input.nextLine().toLowerCase();
        String speak = switch (animal) {
            case "dog" -> "Ruff";
            case "cat" -> "Meow";
            case "horse" -> "Neigh";
            case "bird" -> "Tweet";
            case "lizard" -> "...";
            case "fish" -> "Put me back in the water!";
            case "tiger" -> "Turn around so I can eat you.";
            default -> "I dunno, \"Wololo\" or something probably";
        };

        System.out.printf("The %s says \"%s\"", animal, speak);

    }
}
