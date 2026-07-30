package Day_29;

import java.util.ArrayList;
import java.util.List;

public class NQueens {

    public static void main(String[] args) {

        int n = 4;

        List<List<String>> ans = solveNQueens(n);

        for (List<String> solution : ans) {
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println();
        }
    }

    public static List<List<String>> solveNQueens(int n) {

        List<List<String>> ans = new ArrayList<>();

        char[][] board = new char[n][n];

        // Fill board with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }



        solve(0, board, ans);

        return ans;
    }

    static void solve(int col, char[][] board, List<List<String>> ans) {

        // Base Case
        if (col == board.length) {
            ans.add(construct(board));
            return;
        }




        // Try every row in the current column
        for (int row = 0; row < board.length; row++) {

            if (isSafe(row, col, board)) {

                // Choose
                board[row][col] = 'Q';

                // Explore
                solve(col + 1, board, ans);

                // Undo (Backtracking)
                board[row][col] = '.';
            }
        }
    }

    static boolean isSafe(int row, int col, char[][] board) {

        int dupRow = row;
        int dupCol = col;

        // Check Upper Left Diagonal
        while (row >= 0 && col >= 0) {

            if (board[row][col] == 'Q')
                return false;

            row--;
            col--;
        }

        row = dupRow;
        col = dupCol;

        // Check Left Row
        while (col >= 0) {

            if (board[row][col] == 'Q')
                return false;

            col--;
        }

        row = dupRow;
        col = dupCol;

        // Check Lower Left Diagonal
        while (row < board.length && col >= 0) {

            if (board[row][col] == 'Q')
                return false;

            row++;
            col--;
        }

        return true;
    }

    static List<String> construct(char[][] board) {

        List<String> temp = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            temp.add(new String(board[i]));
        }

        return temp;
    }
}