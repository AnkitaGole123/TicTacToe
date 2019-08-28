import java.util.Scanner;

public class TicTacToe {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    public static void main(String[] args) {
        System.out.println(ANSI_RED + "------lets play TicTacToe------" + ANSI_RESET);
        Game game = new Game();
        while (game.isRunning()) {
            System.out.println(game.display());
            game.play(getInput());
        }
        game.display();
        if (game.getWinner() == null) {
            System.out.println("game over");
        } else {
            System.out.println();
            System.out.println("winner is " +game.getWinner());
        }
    }

    public static Position getInput() {
        Scanner input = new Scanner(System.in);
        System.out.println(ANSI_PURPLE + "row position");
        int row = input.nextInt();
        System.out.println(ANSI_PURPLE + "Column position");
        int column = input.nextInt();
        return new Position(row, column);
    }
}

