import java.util.Random;
import java.util.Scanner;

class TicTacToe {
    final char PLAYER_DOT = 'x';
    final char AI_DOT = 'o';
    final char EMPTY_DOT = '.';
    final int FIELD_SIZE = 3;
    char[][] field = new char[FIELD_SIZE][FIELD_SIZE];
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();


    public static void main(String[] args) {
    new TicTacToe().go();
    }
    void go(){
        initField();
        printField();
        while (true){
            turnPlayer();
            printField();
            if (checkWin(PLAYER_DOT)){
                System.out.println("You won");
                break;
            }
            if (isFieldFull()){
                System.out.println("Sorry draw");
                break;
            }
            turnAi();
            printField();
            if (checkWin(AI_DOT)){
                System.out.println("AI won");
                break;
            }
            if (isFieldFull()){
                System.out.println("Sorry draw");
                break;
            }
        }

    }
    void turnPlayer(){
        int x , y;
        do {
            System.out.println("Enter coordinates X Y (1-3)");
            x = sc.nextByte() - 1;
            y = sc.nextByte() - 1;
        }
        while (!isCellEmpty(x,y));
        field[x][y] = PLAYER_DOT;
    }

    boolean isCellEmpty(int x, int y){
        if (x < 0 || y < 0 || x > 2 || y > 2) return false;
        if (field[x][y] == EMPTY_DOT) return true;
        return false;

    }

    void turnAi(){
        int x , y;
        do {
            x = rand.nextInt(FIELD_SIZE);
            y = rand.nextInt(FIELD_SIZE);
        }
        while (!isCellEmpty(x,y));
        field[x][y] = AI_DOT;

    }
    boolean checkWin(char dot) {
        // check horizontals
        if (field[0][0] == dot && field[0][1] == dot && field[0][2] == dot) return true;
        if (field[1][0] == dot && field[1][1] == dot && field[1][2] == dot) return true;
        if (field[2][0] == dot && field[2][1] == dot && field[2][2] == dot) return true;
        // check verticals
        if (field[0][0] == dot && field[1][0] == dot && field[2][0] == dot) return true;
        if (field[0][1] == dot && field[1][1] == dot && field[2][1] == dot) return true;
        if (field[0][2] == dot && field[1][2] == dot && field[2][2] == dot) return true;
        // check diagonals
        if (field[0][0] == dot && field[1][1] == dot && field[2][2] == dot) return true;
        if (field[2][0] == dot && field[1][1] == dot && field[0][2] == dot) return true;
        return false;
    }
    boolean isFieldFull(){
        for (int i = 0 ; i < FIELD_SIZE; i++)
            for (int j = 0 ; j < FIELD_SIZE; j++)
                if (field[i][j] == EMPTY_DOT) return false;
        return true;

    }

    void initField(){
        for (int i = 0 ; i < FIELD_SIZE; i++)
            for (int j = 0 ; j < FIELD_SIZE; j++)
                field[i][j] = EMPTY_DOT;


    }
    void printField(){
        for (int i = 0 ; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++)
                System.out.print(field[i][j]);
            System.out.println();
        }
    }

}
