// Card class to represent a single card in the memory game

public class Card {
    
    // Card attributes
    private int value;
    private boolean isFlipped;
    private boolean isMatched;
    
    // Constructor
    public Card(int value) {
        this.value = value;
        this.isFlipped = false;
        this.isMatched = false;
    }
    
    // Method to flip the card
    public void flip() {
        if (!isMatched) {
            this.isFlipped = !this.isFlipped;
        }
    }
    
    // Method to get the value
    public int getValue() {
        return this.value;
    }
    
    // Method to check if card is flipped
    public boolean isFlipped() {
        return this.isFlipped;
    }
    
    // Method to set card as matched
    public void setMatched(boolean matched) {
        this.isMatched = matched;
    }
    
    // Method to check if card is matched
    public boolean isMatched() {
        return this.isMatched;
    }
    
    // Method to reset the card
    public void reset() {
        this.isFlipped = false;
    }
    
    // Method to display card
    public String display() {
        if (isMatched) {
            return " ✓ ";
        } else if (isFlipped) {
            return " " + value + " ";
        } else {
            return " ? ";
        }
    }
}
