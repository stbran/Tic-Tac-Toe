package tictactoe;

public class Game {
    public String result = null;
    public int steps = 0;

    public String checkResult(Board board, Player pl) {
        for (int i = 0; i < 3; i++) { //check rows and columns
            if (board.arr[i][0] == pl._sign && board.arr[i][1] == pl._sign && board.arr[i][2] == pl._sign) {
                result = pl._sign + " wins";
            }
            if (board.arr[0][i] == pl._sign && board.arr[1][i] == pl._sign && board.arr[2][i] == pl._sign) {
                result = pl._sign + " wins";
            }
        }
        //check diagonals
        if (board.arr[0][0] == pl._sign && board.arr[1][1] == pl._sign && board.arr[2][2] == pl._sign) {
            result = pl._sign + " wins";
        } else if (board.arr[0][2] == pl._sign && board.arr[1][1] == pl._sign && board.arr[2][0] == pl._sign) {
            result = pl._sign + " wins";
        } else {
            result = yetNotWin(board, pl);
        }
        return result;
    }

    private String yetNotWin(Board board, Player pl) {

        if (steps == 9 && this.result == null) {
            this.result = "Draw";
        }
        return this.result;
    }

    public void printIfResult(String result) {
        if (result != null) {
            System.out.println(result);
            System.exit(0);
        }
    }
}
