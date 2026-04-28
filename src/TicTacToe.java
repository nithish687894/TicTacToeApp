import java.util.Random;

public class TicTacToe {

    // Board setup
    static char[] board = {'1','2','3','4','5','6','7','8','9'};
    static Random random = new Random();

    public static void main(String[] args) {
        System.out.println("Before Computer Move:");
        printBoard();

        computerMove(); // UC7

        System.out.println("\nAfter Computer Move:");
        printBoard();
    }

    // UC7: Computer makes random valid move
    public static void computerMove() {
        int move;

        while (true) {
            move = random.nextInt(9) + 1; // generate 1–9

            if (isValidMove(move)) {
                board[move - 1] = 'O'; // place computer symbol
                System.out.println("Computer chose position: " + move);
                break;
            }
        }
    }

    // Check if slot is free
    public static boolean isValidMove(int move) {
        return board[move - 1] != 'X' && board[move - 1] != 'O';
    }

    // Print board
    public static void printBoard() {
        System.out.println();
        System.out.println(board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("--+---+--");
        System.out.println(board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("--+---+--");
        System.out.println(board[6] + " | " + board[7] + " | " + board[8]);
    }
}