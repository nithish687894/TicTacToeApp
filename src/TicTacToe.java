public static boolean checkDraw() {

    // Check all cells
    for (int i = 0; i < board.length; i++) {

        // If any cell is not filled → not draw
        if (board[i] != 'X' && board[i] != 'O') {
            return false;
        }
    }

    // All cells filled → draw
    return true;
}