import java.util.*;

public class NextPermutationDemo {

    public static void nextPermutation(int[] nums) {
        int n = nums.length;

        // Step 1: Find pivot
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // Step 2: If pivot exists
        if (i >= 0) {
            int j = n - 1;

            // Step 3: Find next greater element
            while (nums[j] <= nums[i]) {
                j--;
            }

            // Swap
            swap(nums, i, j);
        }

        // Step 4: Reverse the right part
        reverse(nums, i + 1, n - 1);
    }

    // Swap function
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Reverse function
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    // Main method
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        System.out.println("Original Array: " + Arrays.toString(nums));

        nextPermutation(nums);

        System.out.println("Next Permutation: " + Arrays.toString(nums));
    }
}