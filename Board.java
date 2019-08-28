public class Board {
    public String[][] board;
    public Board() {
        this.board = new String[][]{{".", ".", "."}, {".", ".", "."}, {".", ".", "."}};

    }
    public String displayBoard() {
        String emptyString = "";
        for (int i = 0; i < board.length; i++) {
            emptyString+="\n";
            for (int j = 0; j < board[i].length; j++) {
                emptyString+=board[i][j]+" | ";
            }
        }
        return emptyString;
    }
    public void updateBoard(Position position, String symbol) {
        board[position.row][position.column] = symbol;
    }

    public String get(Position position) {
        return board[position.row][position.column];
    }

    public boolean match(Position position, String symbol) {
        return get(position).equals(symbol);
    }
}
