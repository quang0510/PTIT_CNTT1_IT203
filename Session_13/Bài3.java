package Session_13;

import java.util.ArrayList;
import java.util.List;

public class Bài3 {
    // Phương thức Generic
    public static <T> List<T> findCommonPatients(List<T> listA, List<T> listB) {

        List<T> result = new ArrayList<>();

        for (T item : listA) {
            if (listB.contains(item) && !result.contains(item)) {
                result.add(item);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        // Test Case 1 Integer
        List<Integer> listA1 = new ArrayList<>();
        listA1.add(101);
        listA1.add(102);
        listA1.add(105);

        List<Integer> listB1 = new ArrayList<>();
        listB1.add(102);
        listB1.add(105);
        listB1.add(108);

        List<Integer> result1 = findCommonPatients(listA1, listB1);
        System.out.println("Test Case 1 Output: " + result1);

        // Test Case 2 string
        List<String> listA2 = new ArrayList<>();
        listA2.add("DN01");
        listA2.add("DN02");
        listA2.add("DN03");

        List<String> listB2 = new ArrayList<>();
        listB2.add("DN02");
        listB2.add("DN04");

        List<String> result2 = findCommonPatients(listA2, listB2);
        System.out.println("Test Case 2 Output: " + result2);
    }
}