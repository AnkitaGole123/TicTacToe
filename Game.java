import java.util.Arrays;
import java.util.List;

public class Game {
    private Board board = new Board();
    private Turn turn = new Turn();

    private List<Position> winningPositions = Arrays.asList(new Position(0,0), new Position(0,1), new Position(0,2));

    Game() {
        this.winningMoves = new int[][]{{0, 0}, {0, 1}, {0, 2}};

    }

    public int[][] winningMoves;
    public int count;

    String display() {
        return board.displayBoard();
    }

    void play(Position position) {
        board.updateBoard(position, turn.changeTurn());
        count++;
    }
    String getWinner() {
        if (winner()) {
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
    private boolean winner() {
        boolean doesMatch = true;
        String turn = this.turn.getTurn();
        for (Position winningPosition : winningPositions) {
            doesMatch &= board.match(winningPosition, turn);
        }
        return doesMatch;
    }
}


