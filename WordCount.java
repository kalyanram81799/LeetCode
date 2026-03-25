import java.util.Scanner;

public class WordCount {

    // Function to count words
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }

        // Split by spaces
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        // Call function
        int result = countWords(input);

        // Output
        System.out.println("Number of words: " + result);

        sc.close();
    }
}