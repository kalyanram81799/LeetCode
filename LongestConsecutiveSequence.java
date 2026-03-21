import java.util.*;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        HashSet<Integer> set = new HashSet<>();

        // Step 1: Add all elements to set
        for (int num : nums) {
            set.add(num);
        }

        int maxLength = 0;

        // Step 2: Find sequences
        for (int num : set) {
            // Start only if it's the beginning of sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;

                // Expand sequence
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums1 = {100, 4, 200, 1, 3, 2};
        int[] nums2 = {0,3,7,2,5,8,4,6,0,1};
        int[] nums3 = {1,0,1,2};

        System.out.println(longestConsecutive(nums1)); // 4
        System.out.println(longestConsecutive(nums2)); // 9
        System.out.println(longestConsecutive(nums3)); // 3
    }
}