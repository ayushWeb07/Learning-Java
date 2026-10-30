package section17;

import java.util.ArrayList;
import java.util.List;

public class DiamondOperator {
    public static void main(String[] args) {
        // initialize the arraylists
        ArrayList<Integer> nums= new ArrayList<>();
        ArrayList<String> names= new ArrayList<>();
        ArrayList<Float> salaries= new ArrayList<>();
        ArrayList<Character> chars= new ArrayList<>();
        var bs= new ArrayList<Boolean>();

        System.out.println(nums.size());

        // add the elements
        nums.add(4);
        nums.add(3);
        nums.add(1);
        System.out.println(nums.size());
        System.out.println(nums);
        nums.add(1, 5);
        System.out.println(nums);

        // set and get the element
        System.out.println(nums.get(2));
        System.out.println(nums.get(1));
        nums.set(2, 20);
        nums.set(1, 10);
        System.out.println(nums);

        // remove the elements
        nums.remove(2);
        System.out.println(nums);

        // reverse
        List<Integer> numsRev= nums.reversed();
        System.out.println(numsRev);
    }
}
