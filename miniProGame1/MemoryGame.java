// MemoryGame main driver class for the memory card game

import java.util.Scanner;

public class MemoryGame {
    
    private GameBoard gameBoard;
    private Scanner input;
    private int difficulty;
    
    // Constructor
    public MemoryGame() {
        this.input = new Scanner(System.in);
        this.difficulty = 0;
    }
    
    // Method to display welcome menu
    public void displayWelcome() {
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║      WELCOME TO MEMORY CARD GAME       ║");
        System.out.println("║                                        ║");
        System.out.println("║  Match pairs of identical cards to win ║");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.println();
    }
    
    // Method to display difficulty menu
    public void displayDifficultyMenu() {
        System.out.println("SELECT DIFFICULTY LEVEL:");
        System.out.println("─────────────────────────");
        System.out.println("1. Easy   (4x4  - 8 pairs)");
        System.out.println("2. Medium (4x6  - 12 pairs)");
        System.out.println("3. Hard   (6x6  - 18 pairs)");
        System.out.println("0. Exit Game");
        System.out.println("─────────────────────────");
        System.out.print("Enter your choice: ");
    }
    
    // Method to set difficulty
    public boolean setDifficulty() {
        displayDifficultyMenu();
        int choice = input.nextInt();
        input.nextLine();
        
        switch (choice) {
            case 1:
                this.gameBoard = new GameBoard(4, 4);
                this.difficulty = 1;
                return true;
                
            case 2:
                this.gameBoard = new GameBoard(4, 6);
                this.difficulty = 2;
                return true;
                
            case 3:
                this.gameBoard = new GameBoard(6, 6);
                this.difficulty = 3;
                return true;
                
            case 0:
                System.out.println("Thank you for playing! Goodbye!");
                return false;
                
            default:
                System.out.println("Invalid choice! Please select again.");
                return setDifficulty();
        }
    }
    
    // Method to play the game
    public void playGame() {
        System.out.println("\n═══════════════════════════════════════════");
        System.out.println("           GAME STARTED");
        System.out.println("═══════════════════════════════════════════\n");
        
        gameBoard.displayBoardWithPositions();
        
        while (!gameBoard.isGameWon()) {
            gameBoard.displayBoard();
            
            System.out.println("Matched: " + gameBoard.getMatchCount() + "/" + gameBoard.getTotalPairs());
            System.out.println("Moves: " + gameBoard.getMoves());
            System.out.println("─────────────────────────────────────────");
            
            // Get first card
            System.out.print("Enter first card position (1-" + (gameBoard.getTotalPairs() * 2) + "): ");
            int pos1 = input.nextInt();
            
            if (!gameBoard.flipCard(pos1)) {
                continue;
            }
            
            gameBoard.displayBoard();
            
            // Get second card
            System.out.print("Enter second card position (1-" + (gameBoard.getTotalPairs() * 2) + "): ");
            int pos2 = input.nextInt();
            
            if (pos1 == pos2) {
                System.out.println("Cannot select the same card twice!");
                gameBoard.resetFlipped();
                continue;
            }
            
            if (!gameBoard.flipCard(pos2)) {
                continue;
            }
            
            gameBoard.displayBoard();
            gameBoard.incrementMoves();
            
            // Check if cards match
            if (gameBoard.checkMatch(pos1, pos2)) {
                System.out.println("✓ Match found!");
            } else {
                System.out.println("✗ No match! Cards flipped back.");
                try {
                    Thread.sleep(2000); // Wait 2 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        
        // Game won
        displayGameWon();
    }
    
    // Method to display game won message
    private void displayGameWon() {
        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.println("║        🎉 CONGRATULATIONS! 🎉         ║");
        System.out.println("║                                        ║");
        System.out.println("║         YOU WON THE GAME!              ║");
        System.out.println("║                                        ║");
        System.out.println("║      Total Moves: " + String.format("%-23d", gameBoard.getMoves()) + "║");
        System.out.println("║      Total Pairs Matched: " + String.format("%-13d", gameBoard.getTotalPairs()) + "║");
        System.out.println("╚════════════════════════════════════════╝\n");
    }
    
    // Method to run the game
    public void run() {
        displayWelcome();
        
        boolean continueGame = true;
        
        while (continueGame) {
            if (setDifficulty()) {
                playGame();
                
                System.out.print("\nPlay again? (yes/no): ");
                String response = input.nextLine().toLowerCase();
                
                if (!response.equals("yes") && !response.equals("y")) {
                    System.out.println("\nThank you for playing! Goodbye!");
                    continueGame = false;
                }
            } else {
                continueGame = false;
            }
        }
        
        input.close();
    }
    
    // Main method
    public static void main(String[] args) {
        MemoryGame game = new MemoryGame();
        game.run();
    }
}
