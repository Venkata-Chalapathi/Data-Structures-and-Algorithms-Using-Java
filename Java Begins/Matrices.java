import java.util.*;

public class Matrices {

    public static boolean searchKey(int matrix[][], int key) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Element at (" + i + "," + j + ").");
                    return true;
                }
            }
        }
        return false;
    }

    public static void spiralMatrix(int matrix[][]) {
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // TOP
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            // RIGHT
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            // BOTTOM
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {
                    return;
                }
                System.out.print(matrix[endRow][j] + " ");
            }
            // LEFT
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) {
                    return;
                }
                System.out.print(matrix[i][startCol] + " ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }

    public static void diagonalSum(int matrix[][]) {
        // int Sum = 0;
        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix[0].length; j++) {
        // if (i == j) {
        // Sum = Sum + matrix[i][j];
        // } else if (i + j == matrix.length - 1) {
        // Sum = Sum + matrix[i][j];
        // }
        // }
        // }
        // System.out.println("Total Diagonal Sum :" + Sum);
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - 1 - i];
            }
        }
        System.out.println("Total sum :" + sum);
    }

    public static boolean stairCase(int matrix[][], int key) {
        int row = 0, col = matrix.length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("Key found at : (" + row + "," + col + ").");
                return true;
            } else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("Key Not Found!!!");
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int matrix[][] = new int[3][3];

        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < 3; j++) {
        // matrix[i][j] = sc.nextInt();
        // }
        // }
        // System.out.println("Matrix U Entered :");
        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < 3; j++) {
        // System.out.print(matrix[i][j] + " ");
        // }
        // System.out.println();
        // }

        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        // searchKey(matrix, 5);
        // spiralMatrix(matrix);
        // diagonalSum(matrix);
        stairCase(matrix, 14);
    }
}
