import java.util.Arrays;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {

        int k = 0; // position to place valid elements

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {

        int[] nums = { 3, 2, 2, 3 };
        int val = 3;

        int newLength = removeElement(nums, val);

        System.out.println("New Length: " + newLength);

        System.out.print("Updated Array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}