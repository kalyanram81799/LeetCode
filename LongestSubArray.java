import java.util.*;

class LongestSubArray {

    public int LongestSubArray(int[] nums, int k) {

        int left = 0, right = 0;
        long sum = nums[0];
        int maxLen = 0;
        int n = nums.length;

        while (right < n) {

            while (left <= right && sum > k) {
                sum -= nums[left];
                left++;
            }

            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            right++;

            if (right < n) {
                sum += nums[right];
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