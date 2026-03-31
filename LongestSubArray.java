import java.util.*;

class LongestSubArray {

    public int LongestSubArray(int[] nums, int k) {

        int l = 0, r = 0;
        long sum = nums[0];
        int maxLen = 0;
        int n = nums.length;

        while (r < n) {

            while (l <= r && sum > k) {
                sum -= nums[l];
                l++;
            }

            if (sum == k) {
                maxLen = Math.max(maxLen, r - l + 1);
            }

            r++;

            if (r < n) {
                sum += nums[r];
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {

        LongestSubArray obj = new LongestSubArray();

        int[] nums = { 1, 2, 1, 1, 1, 3, 2 };
        int k = 3;

        int result = obj.LongestSubArray(nums, k);

        System.out.println("Longest Subarray Length: " + result);
    }
}