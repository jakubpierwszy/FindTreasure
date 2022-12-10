package print_map;

public class CreateMap {
    public CreateMap(char[][] board) {
        this.board = board;
        fillBoard();
    }

    char[][] board;

    public char setStartPoint(int x, int y) {
        return board[x][y] = 115;
    }

    public char setEndPoint(int x, int y) {
        return board[x][y] = 122;
    }

    public char setWall(int x, int y) {
        return board[x][y] = 88;
    }

    public void fillBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 79;
            }
        }
    }

    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";

    public void printBoard() {
        for (char[] chars : board) {
            for (int j = 0; j < board.length; j++) {
                if (chars[j] == 126) {
                    System.out.print(ANSI_YELLOW + chars[j] + ANSI_RESET + " | ");
                } else {
                    System.out.print(ANSI_RESET + chars[j] + " | ");
                }
            }
            System.out.println();
            for (int x = 0; x < board.length; x++) {
                System.out.print("- " + "  ");
            }
            System.out.println();
        }
    }


}
