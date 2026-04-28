import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    static char[] board = {'1','2','3','4','5','6','7','8','9'};
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        boolean gameOver = false;
        char currentPlayer = 'X'; // X = User, O = Computer

        while (!gameOver) {

            printBoard();

            if (currentPlayer == 'X') {
                playerMove();
            } else {
                computerMove();
            }

            // Check win
            if (checkWin()) {
                printBoard();
                System.out.println("Player " + currentPlayer + " wins!");
                gameOver = true;
            }
            // Check draw
            else if (checkDraw()) {
                printBoard();
                System.out.println("Game is a Draw!");
                gameOver = true;
            }
            // Switch turn
            else {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }
    }

    // Player move
    public static void playerMove() {
        int move;
        while (true) {
            System.out.print("Enter position (1-9): ");
            move = sc.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = 'X';
                break;
            } else {
                System.out.println("Invalid move, try again!");
            }
        }
    }

    // Computer move (UC7 reused)
    public static void computerMove() {
        int move;
        while (true) {
            move = random.nextInt(9) + 1;

            if (isValidMove(move)) {
                board[move - 1] = 'O';
                System.out.println("Computer chose: " + move);
                break;
            }
        }
    }

    // Validate move
    public static boolean isValidMove(int move) {
        return move >= 1 && move <= 9 &&
               board[move - 1] != 'X' &&
               board[move - 1] != 'O';
    }

    // Check win
    public static boolean checkWin() {
        int[][] winPatterns = {
            {0,1,2},{3,4,5},{6,7,8},
            {0,3,6},{1,4,7},{2,5,8},
            {0,4,8},{2,4,6}
        };

        for (int[] pattern : winPatterns) {
            if (board[pattern[0]] == board[pattern[1]] &&
                board[pattern[1]] == board[pattern[2]]) {
                return true;
            }
        }
        return false;
    }

    // Check draw
    public static boolean checkDraw() {
        for (char c : board) {
            if (c != 'X' && c != 'O') {
                return false;
            }
        }
        return true;
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