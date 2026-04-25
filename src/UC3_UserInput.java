public class UC4_SlotToIndex {

    // Convert slot (1–9) to row index
    public static int getRow(int slot) {
        return (slot - 1) / 3;
    }

    // Convert slot (1–9) to column index
    public static int getCol(int slot) {
        return (slot - 1) % 3;
    }

    public static void main(String[] args) {

        int slot = 5;

        int row = getRow(slot);
        int col = getCol(slot);

        System.out.println("Slot: " + slot);
        System.out.println("Row: " + row);
        System.out.println("Column: " + col);
    }
}