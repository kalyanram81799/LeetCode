
import java.util.*;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {
        // Step 1: Sort intervals based on start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();

        // Step 2: Add first interval
        int[] current = intervals[0];
        result.add(current);

        // Step 3: Traverse remaining intervals
        for (int i = 1; i < intervals.length; i++) {
            int[] next = intervals[i];

            // Check overlap
            if (next[0] <= current[1]) {
                // Merge intervals
                current[1] = Math.max(current[1], next[1]);
            } else {
                // No overlap → add new interval
                current = next;
                result.add(current);
            }
        }

        // Convert List to array
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {
            {1, 3},
            {2, 6},
            {8, 10},
            {15, 18}
        };

        int[][] merged = merge(intervals);

        // Print result
        System.out.println("Merged Intervals:");
        for (int[] interval : merged) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
    }
}


