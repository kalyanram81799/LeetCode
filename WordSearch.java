import java.util.*;

public class WordSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input rows and columns
        int m = sc.nextInt();
        int n = sc.nextInt();

        char[][] board = new char[m][n];

        // Input grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.next().charAt(0);
            }
        }

        // Input word
        String word = sc.next();

        Solution obj = new Solution();
        boolean result = obj.exist(board, word);

        System.out.println(result);

        sc.close();
    }
}

class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        // Try every cell as starting point
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int i, int j, int index) {

        // ✅ All characters matched
        if (index == word.length()) return true;

        // ❌ Boundary or mismatch
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length 
            || board[i][j] != word.charAt(index)) {
            return false;
        }

        // 🔒 Mark visited
        char temp = board[i][j];
        board[i][j] = '#';

        // 🔍 Explore all 4 directions
        boolean found = dfs(board, word, i + 1, j, index + 1) ||
                        dfs(board, word, i - 1, j, index + 1) ||
                        dfs(board, word, i, j + 1, index + 1) ||
                        dfs(board, word, i, j - 1, index + 1);

        // 🔄 Backtrack
        board[i][j] = temp;

        return found;
    }
}