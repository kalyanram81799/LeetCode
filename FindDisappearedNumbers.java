import java.util.*;

public class FindDisappearedNumbers {

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        // Mark visited numbers
        for (int i : nums) {
            int index = Math.abs(i);

            if (nums[index - 1] > 0) {
                nums[index - 1] *= -1;
            }
        }

        // Store missing numbers
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                res.add(i + 1);
            }
        }

        return res;
    }

    public static void main(String[] args) {

        int[] nums = {4,3,2,7,8,2,3,1};

        List<Integer> result = findDisappearedNumbers(nums);

        System.out.println("Missing numbers: " + result);
    }
}