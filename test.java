import java.util.Random;
import java.util.Scanner;

public class test {
    public static int SIZE = 3 ;
    public static int DOTS_TO_WIN = 3 ;
    public static final char DOT_EMPTY = '•' ;
    public static final char DOT_X = 'X' ;
    public static final char DOT_O = 'O' ;
    public static char [][] map ;
    public static Scanner sc = new Scanner ( System . in );
    public static Random rand = new Random ();

    public static void main(String[] args) {
        task4();
//        initMap ();
        checkWin(DOT_X);
        System.out.println(checkWin(DOT_O));
    }

    public static boolean checkWin ( char dot ) {
//            if (map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
//            if (map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
//            if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
//            if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
//            if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
//            if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
//            if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
//            if (map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
//            return false ;

        Boolean winRow = false;
        Boolean winCol = false;
        Boolean winDiagLeft = false;
        Boolean winDiagRight = false;
        int cell = 0;
        while (!(winRow || winCol || winDiagLeft || winDiagRight) && cell < (SIZE * SIZE)) {
            int row = cell / SIZE;
            int col = cell % SIZE;
            if (map[row][col] == dot) {
                winRow = true;
                winCol = true;
                winDiagLeft = true;
                winDiagRight = true;
                for (int k = 1; k < DOTS_TO_WIN; k++) {
                    try {
                        winRow &= (map[row][col + k] == dot);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        winRow = false;
                    }
                    try {
                        winCol &= (map[row + k][col] == dot);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        winCol = false;
                    }
                    try {
                        winDiagLeft &= (map[row + k][col + k] == dot);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        winDiagLeft = false;
                    }
                    try {
                        winDiagRight &= (map[row + k][col - k] == dot);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        winDiagRight = false;
                    }
                    //System.out.println("cell " + cell + " " + k + " " + (winRow || winCol || winDiagLeft || winDiagRight));
                }
            }
            cell++;
        }
        return winRow || winCol || winDiagLeft || winDiagRight;
    }

//    public static void initMap () {
//        map = new char [ SIZE ][ SIZE ];
//        for ( int i = 0 ; i < SIZE ; i ++) {
//            for ( int j = 0 ; j < SIZE ; j ++) {
//                map [ i ][ j ] = DOT_EMPTY ;
//            }
//        }
//    }

    private static void task4() {
        System.out.println();
        System.out.println("Задание 4");
        map  = new char [SIZE][SIZE];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j <map.length; j++) {
                if (i == j) {
                    map[i][j] = DOT_O;
                }
                if (i == (map.length - 1) - j) {
                    map[i][j] = DOT_X;
                }
                System.out.print(map [i][j] + " ");
            }
            System.out.println();
        }
    }


   
    
    

}
