public class NQueens {

    public static boolean isSafe (char[][] board, int row, int col) {
        // vertical up check
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        //left diagonal up check
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        //right diagonal up check
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }
    public static void nQueens (char[][] board, int row) {
        if (row == board.length) {
            printBoard(board);
            count++;
            return;
        }
        for(int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row + 1);
                board[row][j] = 'x';
            }
        }
    }


    // USED FOR UNDERSTANDING PLACING OF THE QUEENS IN THE BOARD

    // public static void nQueens (char[][] board, int row) {
    //     if (row == board.length) {
    //         printBoard(board);
    //         return;
    //     }
    //     for(int j = 0; j < board.length; j++) {
    //         board[row][j] = 'Q';
    //         nQueens(board, row + 1);
    //         board[row][j] = 'x';
    //     }
    // }

    public static void printBoard (char[][] board) { 
        System.out.println("--------- CHESS BOARD ----------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int count = 0;
    public static void main(String[] args) {
        // int n = 2; --> FOR COMMENT OUT PART
        int n = 4;

        char[][] board = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'x';
            }
        }
        nQueens(board, 0);
        System.out.println("Total ways Possible: " + count);
    }
}
