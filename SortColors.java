import java.util.Arrays;

class SortColors {

    public void sortColors(int[] nums) {

        int zeros = 0;
        int ones = 0;
        int twos = 0;

        // Count 0s, 1s, and 2s
        for (int i : nums) {
            if (i < 1)
                zeros++;
            else if (i > 1)
                twos++;
            else
                ones++;
        }

        int i = 0;

        // Fill 0s
        while (i < zeros) {
            nums[i] = 0;
            i++;
        }

        // Fill 1s
        zeros += ones;
        while (i < zeros) {
            nums[i] = 1;
            i++;
        }

        // Fill 2s
        zeros += twos;
        while (i < zeros) {
            nums[i] = 2;
            i++;
        }
    }

    // Main method to test
    public static void main(String[] args) {

        int[] nums = { 2, 0, 2, 1, 1, 0 };

        Solution obj = new Solution();
        obj.sortColors(nums);

        System.out.println(Arrays.toString(nums));
    }
}