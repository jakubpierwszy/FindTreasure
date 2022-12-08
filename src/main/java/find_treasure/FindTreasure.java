package find_treasure;

import print_map.CreateMap;

import java.util.*;

public class FindTreasure {
    static char[][] board = new char[4][4];
    static CreateMap createMap = new CreateMap(board);

    //startpoint
    static int xS = 0;
    static int yS = 0;
    //endpoint
    static int xZ = 3;
    static int yZ = 2;

    public static void main(String[] args) {
        createMap.setStartPoint(0, 0);
        createMap.setEndPoint(3, 3);
        createMap.printBoard();
        System.out.println();
        System.out.println();

        findWay();

        printMoveMap();
    }

    static List<Integer> xlist = new ArrayList<>();
    static List<Integer> ylist = new ArrayList<>();

    public static void findWay() {
        while ((xS < xZ) || (yS < yZ)) {
            if (xS < xZ) {
                lookX();
            } else if (yS < yZ) {
                lookY();
            }
        }
    }

    public static boolean lookX() {
        if (checkMove(board[xS + 1][yS])) {
            xlist.add(xS + 1);
            ylist.add(yS);
            xS++;
            return true;
        }
        return false;
    }

    public static boolean lookY() {
        if (checkMove(board[xS][yS + 1])) {
            xlist.add(xS);
            ylist.add(yS + 1);
            yS++;
            return true;
        }
        return false;
    }

    public static void printMoveMap() {
        for (int i = 0; i < xlist.size(); i++) {
            System.out.print("x:" + xlist.get(i) + " ");
            System.out.println("y:" + ylist.get(i));
        }
    }

    public static boolean checkMove(char sign) {
        if (sign == 79 || sign == 122) {
            return true;
        } else return false;
    }

}
