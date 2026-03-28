public class MaxNumber {
    public static void main(String[] args) {
        int[] arr = {10, 25, 7, 89, 45};

        int max = arr[0]; // assume first element is max

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // update max
            }
        }

        System.out.println("Maximum number is: " + max);
    }
}