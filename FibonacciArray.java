import java.util.Scanner;

public class FibonacciArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input");
            return;
        }

        int[] fib = new int[n];

        // Base cases
        if (n >= 1)
            fib[0] = 0;
        if (n >= 2)
            fib[1] = 1;

        // Fill array
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        // Print result
        System.out.println("Fibonacci Series:");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(fib[i] + " ");
        }
    }



    
}