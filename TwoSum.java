import java.util.*;

public class TwoSum{

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int needed = target - nums[i];

            // Check if needed value already exists
            if (map.containsKey(needed)) {
                return new int[]{map.get(needed), i};
            }

            // Store current number and its index
            map.put(nums[i], i);
        }

        return new int[]{-1, -1}; // if no solution
    }

    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 7, 2};
        int target = 10;

        int[] result = twoSum(nums, target);

        System.out.println("Index 1: " + result[0]);
        System.out.println("Index 2: " + result[1]);

        if (result[0] != -1) {
            System.out.println("Values: " + nums[result[0]] + " + " 
                               + nums[result[1]] + " = " + target);
        } else {
            System.out.println("No solution found");
        }
    }
}