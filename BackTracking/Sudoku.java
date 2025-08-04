import java.util.*;

public class Sudoku {

    public static boolean isSafe(int board[][], int row, int col, int dig) {

        // Col

        for (int i = 0; i <= 8; i++) {
            if (board[i][col] == dig) {
                return false;
            }
        }

        // row

        for (int j = 0; j <= 8; j++) {
            if (board[row][j] == dig) {
                return false;
            }
        }

        // Grid

        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        // 3 x 3 Grid

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == dig) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean sudokuSolver(int board[][], int row, int col) {

        // Base Case

        if (row == 9) {
            return true;
        }
        // Recursion

        int nextRow = row, nextCol = col + 1;

        if (col + 1 == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        if (board[row][col] != 0) {
            return sudokuSolver(board, nextRow, nextCol);
        }

        for (int dig = 1; dig <= 9; dig++) {
            if (isSafe(board, row, col, dig)) {
                board[row][col] = dig;
                if (sudokuSolver(board, nextRow, nextCol)) {
                    return true;
                }
                board[row][col] = 0;
            }
        }
        return false;
    }

    public static void printBoard(int board[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // 0 represents empty cells
        int[][] board = {
                { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
                { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
                { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
                { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
                { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
                { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
                { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
                { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
                { 0, 0, 0, 0, 8, 0, 0, 7, 9 }
        };

        if (sudokuSolver(board, 0, 0)) {
            System.out.println("Sol Exists");
            printBoard(board);
        } else {
            System.out.println("Sol Not Exist");
        }
    }
}
