import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;

public class PositiveNumbers {
    public static void main(String[] args) throws Exception {
        
        List<Integer> numList = new ArrayList<>();

        numList.add(10);
        numList.add(20);
        numList.add(-30);
        numList.add(-40);
        numList.add(50);

        List<Integer> posList = positive(numList);
        System.out.println(posList);
        
    }

    public static List<Integer> positive (List<Integer> numbers) {

        ArrayList<Integer> posNum = numbers.stream()
        .filter(i -> i > 0)
        .collect(Collectors.toCollection(ArrayList::new));

        return posNum;

    }
}
