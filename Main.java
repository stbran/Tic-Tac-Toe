package tictactoe;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        Board board = new Board();
        Player plX = new Player('X');
        Player plO = new Player('O');
        board.printGameGrid();
        boolean flag = true;
        while (flag) {
            plX.move(board, game);
            game.printIfResult(game.result);
            plO.move(board, game);
            game.printIfResult(game.result);
        }
    }
}
