package print_map;

import java.util.HashMap;
import java.util.Map;

public class CreateMap {

    public static void main(String[] args) {
        CreateMap createMap = new CreateMap();
        createMap.fillBoard();
        createMap.setStartPoint(0, 0);
        createMap.setEndPoint(3, 3);
        createMap.printBoard();

    }

    char[][] board = new char[4][4];

    public char setStartPoint(int x, int y) {
        return board[x][y] = 120;
    }

    public char setEndPoint(int x, int y) {
        return board[x][y] = 122;
    }

    public void fillBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 79;
            }
        }
    }


    public void printBoard() {
        for (char[] chars : board) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(chars[j] + " | ");
            }
            System.out.println();
            for (int x = 0; x < board.length; x++) {
                System.out.print("- " + "  ");
            }
            System.out.println();
        }
    }


}
