public class Game {
    Board board = new Board();
    Turn turn = new Turn();
    public int count;

    void display() {
        board.displayBoard();
    }
    void play(Position position) {
        board.updateBoard(position, turn.changeTurn());
        count ++;
    }
    String getWinner() {
        if (board.board[0][0].equals(turn.getTurn()) && board.board[0][1].equals(turn.getTurn()) && board.board[0][2].equals(turn.getTurn())) {
            return turn.getTurn();
        } else if (board.board[1][0].equals(turn.getTurn()) && board.board[1][1].equals(turn.getTurn()) && board.board[1][2].equals(turn.getTurn())) {
            return turn.getTurn();
        } else if (board.board[2][0].equals(turn.getTurn()) && board.board[2][1].equals(turn.getTurn()) && board.board[2][2].equals(turn.getTurn())) {
            return turn.getTurn();
        } else if (board.board[0][0].equals(turn.getTurn()) && board.board[1][1].equals(turn.getTurn()) && board.board[2][2].equals(turn.getTurn())) {
            return turn.getTurn();
        } else if (board.board[0][2].equals(turn.getTurn()) && board.board[1][1].equals(turn.getTurn()) && board.board[2][0].equals(turn.getTurn())) {
            return turn.getTurn();
        } else if (board.board[0][0].equals(turn.getTurn()) && board.board[1][0].equals(turn.getTurn()) && board.board[2][0].equals(turn.getTurn())) {
            return turn.getTurn();
        } else if (board.board[0][1].equals(turn.getTurn()) && board.board[1][1].equals(turn.getTurn()) && board.board[2][1].equals(turn.getTurn())) {
            return turn.getTurn();
        } else if (board.board[0][2].equals(turn.getTurn()) && board.board[1][2].equals(turn.getTurn()) && board.board[2][2].equals(turn.getTurn())) {
            return turn.getTurn();
        }
        return null;
    }
    boolean isRunning() {
        if (count == 9) {
            return false;
            }
        return getWinner() == null;
    }
    }
