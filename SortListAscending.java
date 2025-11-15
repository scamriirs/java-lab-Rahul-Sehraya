import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListAscending {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(9);

        System.out.println("Original list: " + numbers);

        Collections.sort(numbers);

        System.out.println("Sorted list (ascending): " + numbers);
    }
}