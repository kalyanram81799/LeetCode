import java.util.Arrays;

class MatchSigns {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        int posIndex = 0; // even index
        int negIndex = 1; // odd index
        
        for (int num : nums) {
            if (num > 0) {
                result[posIndex] = num;
                posIndex += 2;
            } else {
                result[negIndex] = num;
                negIndex += 2;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        MatchSigns solution = new MatchSigns();
        int[] nums = {3, 1, -2, -5, 2, -4};
        int[] result = solution.rearrangeArray(nums);
        System.out.println(Arrays.toString(result));
    }
}