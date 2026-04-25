import java.util.Scanner;

public class UC3_UserInput {

    public static int getUserSlot() {

        Scanner sc = new Scanner(System.in);
        int slot;

        while (true) {

            System.out.print("Enter slot (1 to 9): ");
            slot = sc.nextInt();

            if (slot >= 1 && slot <= 9) {
                return slot;
            } else {
                System.out.println("Invalid! Enter again.");
            }
        }
    }

    public static void main(String[] args) {

        int userSlot = getUserSlot();

        System.out.println("User selected slot: " + userSlot);
    }
}