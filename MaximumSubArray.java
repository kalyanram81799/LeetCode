import java.util.*;

class Solution {
    public int maxSubArray(int[] nums) {

        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}

public class MaximumSubArray {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("enter the n value ");
        int n = S.nextInt();
        int[] nums = new int[n];
        System.out.println("enter array elements:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = S.nextInt();
        }
        Solution sol = new Solution();
        int result = sol.maxSubArray(nums);
        System.out.println("Maximum subarray sum: " + result);
    }
}