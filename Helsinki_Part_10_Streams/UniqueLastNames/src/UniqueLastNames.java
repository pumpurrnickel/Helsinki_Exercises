import java.util.ArrayList;
import java.util.Scanner;

public class UniqueLastNames {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<>();

        System.out.println("Enter some basic information. Entering 'quit' will end the program: ");

        while (true) {

            System.out.println("Continue entering personal information?");
            String q = "quit";

            if(input.hasNextLine()) {
                q = input.nextLine();
            }

            if(q.equalsIgnoreCase("quit")) {
                break;
            }

            System.out.println("Input first name: ");
            String firstName = "NaN";

            if(input.hasNextLine()) {
                firstName = input.nextLine();
            }

            System.out.println("Input last name: ");
            String lastName = "NaN";

            if(input.hasNextLine()) {
                lastName = input.nextLine();
            }

            System.out.println("Input the year of birth: ");
            int birthYear = 0;

            if(input.hasNextLine()) {
                birthYear = Integer.valueOf(input.nextLine());
            }

            people.add(new Person(firstName, lastName, birthYear));

        }

        System.out.println("\nLast names in alphabetical order: ");

        people.stream()
            .map(person -> person.getLastName())
            .distinct()
            .sorted()
            .forEach(i -> System.out.println(i));

    }
}
