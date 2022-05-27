import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();

        System.out.println("Enter anything. Return a blank entry to read your entries.");

        while (true) {

            String response = input.nextLine();

            if(response.isEmpty()) {
                break;
            }

            inputs.add(response);

        }

        inputs.stream()
        .forEach(i -> System.out.println(i));

    }
}
