import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> inputs = new ArrayList<>();

        System.out.println("Enter any amount of numbers.\nEntering a negative number will stop the input reading.");

        while (true) {

            int response = Integer.parseInt(input.nextLine());

            if (response < 0) {
                break;
            }

            inputs.add(response);

        }

        inputs.stream()
        .filter(i -> i <= 5)
        .forEach(i -> System.out.println(i));
        
    }
}
