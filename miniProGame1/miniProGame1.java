import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class miniProGame1 {
    private static char[] cards;
    private static boolean[] flipped;
    private static int pairsFound;
    private static final int PAIRS = 4;
    private static final int TOTAL_CARDS = PAIRS * 2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        initializeGame();

        System.out.println("=== Mini Memory Game ===\n");
        System.out.println("Find all 4 matching pairs (A, B, C, D).");
        System.out.println("Enter card indices (0-" + (TOTAL_CARDS - 1) + ") to flip.\n");

        while (pairsFound < PAIRS) {
            displayBoard();
            System.out.print("Enter first card index: ");
            int first = getValidIndex(scanner);
            flipCard(first);
            displayBoard();

            System.out.print("Enter second card index: ");
            int second = getValidIndex(scanner);
            while (second == first) {
                System.out.print("Choose a different card: ");
                second = getValidIndex(scanner);
            }
            flipCard(second);
            displayBoard();

            if (cards[first] == cards[second]) {
                pairsFound++;
                System.out.println("Match found! Pairs: " + pairsFound + "/" + PAIRS + "\n");
            } else {
                System.out.println("No match. Flipping back.\n");
                flipped[first] = false;
                flipped[second] = false;
            }
        }

        System.out.println("Congratulations! You found all pairs!");
        scanner.close();
    }

    private static void initializeGame() {
        cards = new char[]{'A', 'B', 'C', 'D', 'A', 'B', 'C', 'D'};
        ArrayList<Character> list = new ArrayList<>();
        for (char c : cards) list.add(c);
        Collections.shuffle(list);
        for (int i = 0; i < TOTAL_CARDS; i++) cards[i] = list.get(i);
        flipped = new boolean[TOTAL_CARDS];
        pairsFound = 0;
    }

    private static void displayBoard() {
        System.out.print("Board: ");
        for (int i = 0; i < TOTAL_CARDS; i++) {
            System.out.print(flipped[i] ? "[" + cards[i] + "]" : "[" + (i) + "]");
            System.out.print(" ");
        }
        System.out.println();
    }

    private static void flipCard(int index) {
        flipped[index] = true;
    }

    private static int getValidIndex(Scanner scanner) {
        while (true) {
            try {
                int idx = Integer.parseInt(scanner.nextLine().trim());
                if (idx >= 0 && idx < TOTAL_CARDS) {
                    if (flipped[idx]) {
                        System.out.print("Card already flipped. Choose another: ");
                        continue;
                    }
                    return idx;
                }
            } catch (NumberFormatException ignored) {}
            System.out.print("Invalid. Enter 0-" + (TOTAL_CARDS - 1) + ": ");
        }
    }
}
