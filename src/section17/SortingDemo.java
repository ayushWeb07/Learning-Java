package section17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingDemo {
    public static void main(String[] args) {
        List<Integer> nums= new ArrayList<>();

        nums.add(2);
        nums.add(5);
        nums.add(1);
        nums.add(3);
        System.out.println(nums);

        // method 1
        Collections.sort(nums);
        System.out.println(nums);
        Collections.sort(nums, Collections.reverseOrder());
        System.out.println(nums);

        // method 2
        nums.sort(Comparator.naturalOrder());
        System.out.println(nums);
        nums.sort(Comparator.reverseOrder());
        System.out.println(nums);
    }
}
