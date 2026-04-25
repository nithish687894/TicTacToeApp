import java.util.Random;

public class UC2_TossDecision {

    public static void main(String[] args) {

        String player1 = "Player 1";
        String player2 = "Player 2";

        char player1Symbol;
        char player2Symbol;
        String currentPlayer;

        Random random = new Random();
        int toss = random.nextInt(2);

        System.out.println("Toss Result: " + toss);

        if (toss == 0) {
            currentPlayer = player1;
            player1Symbol = 'X';
            player2Symbol = 'O';
        } else {
            currentPlayer = player2;
            player1Symbol = 'O';
            player2Symbol = 'X';
        }

        System.out.println("First Player: " + currentPlayer);
        System.out.println("Player 1 Symbol: " + player1Symbol);
        System.out.println("Player 2 Symbol: " + player2Symbol);
    }
}