import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class AverageOfNumbers {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

        System.out.println("Enter a sequence of numbers. Enter 'end' to total the average of the numbers listed.");

        while (true) {

            String response = input.nextLine();

            if (response.equalsIgnoreCase("end")) {

                double average = inputs.stream()
                
                        .mapToInt(s -> Integer.valueOf(s))
                        .average()
                        .getAsDouble();

                System.out.println("Average: " + average);

            }

            inputs.add(response);

        }
    }
}
