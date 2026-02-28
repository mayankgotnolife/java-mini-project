// GameBoard class to manage the game board and game logic

public class GameBoard {
    
    // Game board attributes
    private Card[] cards;
    private int rows;
    private int cols;
    private int matchCount;
    private int moves;
    
    // Constructor
    public GameBoard(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.cards = new Card[rows * cols];
        this.matchCount = 0;
        this.moves = 0;
        initializeBoard();
    }
    
    // Method to initialize the game board with pairs
    private void initializeBoard() {
        int totalCards = rows * cols;
        
        // Create pairs of cards
        for (int i = 0; i < totalCards / 2; i++) {
            cards[i] = new Card(i + 1);
            cards[totalCards / 2 + i] = new Card(i + 1);
        }
        
        // Shuffle the cards
        shuffleCards();
    }
    
    // Method to shuffle cards randomly
    private void shuffleCards() {
        for (int i = cards.length - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));
            
            // Swap
            Card temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }
    }
    
    // Method to display the board
    public void displayBoard() {
        System.out.println("\n");
        
        for (int i = 0; i < rows; i++) {
            System.out.print("  ");
            for (int j = 0; j < cols; j++) {
                System.out.print(cards[i * cols + j].display() + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    // Method to display board with positions
    public void displayBoardWithPositions() {
        System.out.println("\nCard Positions:");
        
        for (int i = 0; i < rows; i++) {
            System.out.print("  ");
            for (int j = 0; j < cols; j++) {
                int position = i * cols + j + 1;
                System.out.print("[" + String.format("%2d", position) + "] ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    // Method to flip a card at given position
    public boolean flipCard(int position) {
        if (position < 1 || position > cards.length) {
            System.out.println("Invalid position! Choose between 1 and " + cards.length);
            return false;
        }
        
        if (cards[position - 1].isMatched()) {
            System.out.println("Card already matched!");
            return false;
        }
        
        cards[position - 1].flip();
        return true;
    }
    
    // Method to check if two cards match
    public boolean checkMatch(int pos1, int pos2) {
        Card card1 = cards[pos1 - 1];
        Card card2 = cards[pos2 - 1];
        
        if (card1.getValue() == card2.getValue()) {
            card1.setMatched(true);
            card2.setMatched(true);
            matchCount++;
            return true;
        } else {
            card1.reset();
            card2.reset();
            return false;
        }
    }
    
    // Method to reset flipped cards
    public void resetFlipped() {
        for (Card card : cards) {
            if (!card.isMatched()) {
                card.reset();
            }
        }
    }
    
    // Method to check if all cards are matched
    public boolean isGameWon() {
        return matchCount == (rows * cols) / 2;
    }
    
    // Method to get total pairs
    public int getTotalPairs() {
        return (rows * cols) / 2;
    }
    
    // Method to get matched pairs count
    public int getMatchCount() {
        return matchCount;
    }
    
    // Method to increment moves
    public void incrementMoves() {
        this.moves++;
    }
    
    // Method to get moves
    public int getMoves() {
        return moves;
    }
}
