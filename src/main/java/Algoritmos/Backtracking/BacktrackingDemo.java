package Algoritmos.Backtracking;

/**
 *
 * @author Guilherme
 */
public class BacktrackingDemo {

    private int[][] board;
    private int N;
    private boolean[][] row, col, square;
    private boolean solved;

    public BacktrackingDemo(int[][] board) {
        this.board = board;
        this.N = board.length;
        this.row = new boolean[N][N];
        this.col = new boolean[N][N];
        this.square = new boolean[N][N];
        this.solved = false;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (board[i][j] != 0) {
                    int num = board[i][j] - 1;
                    row[i][num] = true;
                    col[j][num] = true;
                    square[(i / 3) * 3 + j / 3][num] = true;
                }
            }
        }
    }

    public boolean solve() {
        int row = -1;
        int col = -1;
        boolean isEmpty = true;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    isEmpty = false;
                    break;
                }
            }
            if (!isEmpty) {
                break;
            }
        }
        if (isEmpty) {
            this.solved = true;
            return true;
        }
        for (int num = 1; num < N; num++) {
            if (isSafe(row, col, num)) {
                board[row][col] = num;
                mark(row, col, num, true);
                if (solve()) {
                    return true;
                }
                mark(row, col, num, false);
                board[row][col] = 0;
            }
        }
        return false;
    }

    static boolean isSafe(int row, int col, int num) {
        int[][] grid = null;

        for (int x = 0; x <= 8; x++) {
            if (grid[row][x] == num) {
                return false;
            }
        }

        for (int x = 0; x <= 8; x++) {
            if (grid[x][col] == num) {
                return false;
            }
        }
        int startRow = row - row % 3, startCol
                = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i + startRow][j + startCol] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    private void mark(int row, int col, int num, boolean mark) {
        int index = (row / 3) * 3 + col / 3;
        boolean[][] rows = null;
        rows[row][num] = mark;
        boolean[][] cols = null;
        cols[col][num] = mark;
        boolean[][] squares = null;
        squares[index][num] = mark;
    }

    public static void main(String[] args) {
        int[][] board = {
            {3, 0, 6, 5, 0, 8, 4, 0, 0},
            {5, 2, 0, 0, 0, 0, 0, 0, 0},
            {0, 8, 7, 0, 0, 0, 0, 3, 1},
            {0, 0, 3, 0, 1, 0, 0, 8, 0},
            {9, 0, 0, 8, 6, 3, 0, 0, 5},
            {0, 5, 0, 0, 9, 0, 6, 0, 0},
            {1, 3, 0, 0, 0, 0, 2, 5, 0},
            {0, 0, 0, 0, 0, 0, 0, 7, 4},
            {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        BacktrackingDemo demo = new BacktrackingDemo(board);
        if (demo.solve()) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    System.out.println(board[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("No solution exists");
        }
    }
}
