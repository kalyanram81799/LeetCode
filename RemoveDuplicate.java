class Re {
    public int removeDuplicates(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

        Re solution = new Re();
        int uniqueCount = solution.removeDuplicates(arr);

        System.out.println("Unique count: " + uniqueCount);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(arr[i]);
            if (i < uniqueCount - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}