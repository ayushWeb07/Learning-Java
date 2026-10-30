package section17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableList {
    public static void main(String[] args) {
        List<Integer> nums= new ArrayList<>();

        nums.add(2);
        nums.add(5);
        nums.add(1);
        nums.add(3);
        System.out.println(nums);

        // make it immutable now, so it can't be changed any more
        nums= Collections.unmodifiableList(nums);
    }
}
