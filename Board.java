public class Board {
    public String[][] board;
    public Board() {
        this.board = new String[][]{{".", ".", "."}, {".", ".", "."}, {".", ".", "."}};
    }
    public void displayBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
        }
    }
    public void updateBoard(Position position, String symbol) {
        board[position.row][position.column] = symbol;
    }
}
