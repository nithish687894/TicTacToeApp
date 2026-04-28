public static boolean checkWin(char player) {

    // Row check
    for (int i = 0; i < 9; i += 3) {
        if (board[i] == player &&
            board[i + 1] == player &&
            board[i + 2] == player) {
            return true;
        }
    }

    // Column check
    for (int i = 0; i < 3; i++) {
        if (board[i] == player &&
            board[i + 3] == player &&
            board[i + 6] == player) {
            return true;
        }
    }

    // Diagonal check
    if (board[0] == player &&
        board[4] == player &&
        board[8] == player) {
        return true;
    }

    if (board[2] == player &&
        board[4] == player &&
        board[6] == player) {
        return true;
    }

    return false;
}