import java.util.*;

public class MissingNumber {

    public int missingNumber(int[] nums) {
        int xor = nums.length;

        for (int i = 0; i < nums.length; i++) {
            xor = xor ^ i ^ nums[i];
        }

        return xor;
    }

    public static void main(String[] args) {
        MissingNumber obj = new MissingNumber();

        int[] nums = { 3, 0, 1 };

        int result = obj.missingNumber(nums);

        System.out.println("Missing Number: " + result);
    }
}