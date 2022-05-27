import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class AverageOfSelectedNumbers {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

        System.out.println("Enter a sequence of numbers. Enter 'end' to close the input.");

        while (true) {

            String response = input.nextLine();

            if (response.equalsIgnoreCase("end")) {

                System.out.println("Would you like to average all the positive [p] or negative [n] numbers?");

                response = input.nextLine();

                if (response.equalsIgnoreCase("n")) {

                    double negative = inputs.stream()

                        .mapToInt(s -> Integer.valueOf(s))
                        .filter(i -> i <= 0)
                        .average()
                        .getAsDouble();

                    System.out.print("Average of negative numbers: " + negative);

                }

                if (response.equalsIgnoreCase("p")) {

                    double positive = inputs.stream()

                        .mapToInt(s -> Integer.valueOf(s))
                        .filter(i -> i >= 0)
                        .average()
                        .getAsDouble();

                    System.out.println("Average of positive numbers: " + positive);

                }

            }

            inputs.add(response);
            
        }
    }

}
