class Board {
    String[][] board;
    Board() {
        this.board = new String[][]{{".", ".", "."}, {".", ".", "."}, {".", ".", "."}};

    }
    String displayBoard() {
        StringBuilder emptyString = new StringBuilder();
        for (String[] strings : board) {
            emptyString.append("\n");
            for (String string : strings) {
                emptyString.append(string).append(" | ");
            }
        }
        return emptyString.toString();
    }
    void updateBoard(Position position, String symbol) {
        board[position.row][position.column] = symbol;
    }

    private String get(Position position) {
        return board[position.row][position.column];
    }

    boolean match(Position position, String symbol) {
        return get(position).equals(symbol);
    }
}
