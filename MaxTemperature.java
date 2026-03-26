public class MaxTemperature {

    public static void main(String[] args) {
        // Example temperature data
        int[] temperatures = {30, 35, 28, 40, 33, 37};

        int maxTemp = temperatures[0];

        // Loop to find maximum temperature
        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] > maxTemp) {
                maxTemp = temperatures[i];
            }
        }

        // Output result
        System.out.println("Maximum Temperature: " + maxTemp);
    }
}