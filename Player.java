package tictactoe;

import java.util.Scanner;

public class Player {
    public static String userX;
    public static String userY;
    public static Scanner scanner = new Scanner(System.in);
    public char _sign;
//    public int steps = 0;


    public Player(char sign) {
        _sign = sign;
    }

    public void move(Board board, Game game) {
        boolean flag = true;
        while (flag) {
            System.out.print("Enter the coordinates: ");
            userY = scanner.next();
            userX = scanner.next();
            flag = checkCoordinates(userX, userY, flag, board);
        }
        setPoint(this, userX, userY, board, game);//set point on the board
        board.printGameGrid(userX, userY);
        game.checkResult(board, this);
    }

    public static boolean checkCoordinates(String userX, String userY, boolean flag, Board board) {
        if (!(userY.matches("\\d")) || !(userX.matches("\\d")))  {
            System.out.println("You should enter numbers!");
        } else if (Integer.parseInt(userY) > 3 || Integer.parseInt(userY) < 1 || Integer.parseInt(userX) > 3 || Integer.parseInt(userX) < 1) {
            System.out.println("Coordinates should be from 1 to 3!");
        } else if (board.arr[Integer.parseInt(userY) - 1][Integer.parseInt(userX) - 1] == 'X' || board.arr[Integer.parseInt(userY) - 1][Integer.parseInt(userX) - 1] == 'O') {
            System.out.println("This cell is occupied! Choose another one!");
        } else flag = false;
        return flag;
    }

    public void setPoint(Player pl, String x, String y, Board board, Game game) {
        int userX = Integer.parseInt(x);
        int userY = Integer.parseInt(y);
        board.arr[userY - 1][userX - 1] = pl._sign;
        game.steps++;
    }
}
