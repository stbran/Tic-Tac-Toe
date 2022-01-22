package tictactoe;

import java.util.Scanner;

public class Board {
    public char[][] arr = new char[3][3];//board
    public static Scanner scanner = new Scanner(System.in);
    public static Player pl;

    public void printGameGrid() {//empty
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for(int j = 0; j < 3; j++) {
                arr[i][j] = ' ';
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("---------");
    }

    public void printGameGrid(String x, String y) { //player move {y,x}
        int userX = Integer.parseInt(x);
        int userY = Integer.parseInt(y);
        System.out.println("---------");//print board with point
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for(int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("---------");
    }
}
