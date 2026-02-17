package Algoritmos.Backtracking;

/**
 *
 * @author Guilherme
 */
public class BacktrackingDemoV2 {

    BacktrackingDemoV2(int[][] grid1) {
    }
    private boolean[][] rows = new boolean[9][9];
    private boolean[][] cols = new boolean[9][9];
    private boolean[][] squares = new boolean[9][9];
    private int[][] grid = new int[9][9];

    private boolean solveSudoku(int row, int col) {
        if (row == 9) {
            row = 0;
            if (++col == 9) {
                return true;
            }
        }
        if (grid[row][col] != 0) {
            return solveSudoku(row + 1, col);
        }
        for (int num = 1; num <= 9; num++) {
            if (isSafe(row, col, num, rows, cols, squares)) {
                grid[row][col] = num;
                mark(row, col, num, true, rows, cols, squares);
                if (solveSudoku(row + 1, col)) {
                    return true;
                }
                mark(row, col, num, false, rows, cols, squares);
                grid[row][col] = 0;
            }
        }
        return false;
    }

    private boolean isSafe(int row, int col, int num, boolean[][] rows, boolean[][] cols, boolean[][] squares) {
        int index = (row / 3) * 3 + col / 3;
        return !(rows[row][num - 1] || cols[col][num - 1] || squares[index][num - 1]);
    }

    private void mark(int row, int col, int num, boolean mark, boolean[][] rows, boolean[][] cols, boolean[][] squares) {
        int index = (row / 3) * 3 + col / 3;
        rows[row][num - 1] = mark;
        cols[col][num - 1] = mark;
        squares[index][num - 1] = mark;
    }

    public void solveSudoku() {
        if (solveSudoku(0, 0)) {
            printGrid();
        } else {
            System.out.println("No solution exists");
        }
    }

    private void printGrid() {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                System.out.print(grid[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] grid = {{3, 0, 6, 5, 0, 8, 4, 0, 0},
        {5, 2, 0, 0, 0, 0, 0, 0, 0},
        {0, 8, 7, 0, 0, 0, 0, 3, 1},
        {0, 0, 3, 0, 1, 0, 0, 8, 0},
        {9, 0, 0, 8, 6, 3, 0, 0, 5},
        {0, 5, 0, 0, 9, 0, 6, 0, 0},
        {1, 3, 0, 0, 0, 0, 2, 5, 0},
        {0, 0, 0, 0, 0, 0, 0, 7, 4},
        {0, 0, 5, 2, 0, 6, 3, 0, 0}};
        BacktrackingDemoV2 sudoku = new BacktrackingDemoV2(grid);
        sudoku.solveSudoku();
    }
}
