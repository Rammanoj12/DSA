public class QueensBacktracking {
    private int N;
    private int[] queens;

    public QueensBacktracking(int N) {
        this.N = N;
        queens = new int[N];
    }

    public void solve() {
        if (placeQueens(0)) {
            printSolution();
        } else {
            System.out.println("No solution exists.");
        }
    }

    private boolean placeQueens(int row) {
        if (row == N) {
            return true; // All queens are placed successfully
        }

        for (int col = 0; col < N; col++) {
            if (isSafe(row, col)) {
                queens[row] = col; // Place the queen at (row, col)

                // Recursively place the rest of the queens
                if (placeQueens(row + 1)) {
                    return true;
                }

                // If placing the queen at (row, col) doesn't lead to a solution, backtrack.
                queens[row] = -1;
            }
        }

        return false; // Could not place the queen in this row, need to backtrack.
    }

    private boolean isSafe(int row, int col) {
        // Check if no queen is present in the same column or diagonal
        for (int i = 0; i < row; i++) {
            if (queens[i] == col || Math.abs(queens[i] - col) == Math.abs(i - row)) {
                return false;
            }
        }
        return true;
    }

    private void printSolution() {
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                if (queens[row] == col) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 4; // Change N to the desired size of the chessboard
        QueensBacktracking solver = new QueensBacktracking(N);
        solver.solve();
    }
}
