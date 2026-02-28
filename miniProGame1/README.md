# Mini Memory Game

A console-based card matching memory game built with Java. Test your memory by flipping cards and finding matching pairs!

## Game Description

This is an interactive memory card game where players flip cards to find matching pairs. The game features different difficulty levels with varying board sizes and includes move tracking to challenge yourself.

## Features

- **Multiple Difficulty Levels**
  - Easy: 4x4 board (8 pairs)
  - Medium: 4x6 board (12 pairs)
  - Hard: 6x6 board (18 pairs)

- **Game Statistics**
  - Track number of moves made
  - Count matched pairs
  - Final score display

- **User-Friendly Interface**
  - Clear board visualization with card positions
  - Intuitive menu system
  - Instant feedback on matches

## Class Structure

- **`MemoryGame.java`** - Main driver class with game menu and flow control
- **`GameBoard.java`** - Game logic, board management, and card matching
- **`Card.java`** - Individual card representation with flip and matching states

## How to Compile and Run

### Compilation
```bash
javac *.java
```

### Run the Game
```bash
java MemoryGame
```

## How to Play

1. **Start the Game**: Run `java MemoryGame`
2. **Select Difficulty**: Choose from Easy, Medium, or Hard
3. **View Board**: The card positions will be displayed (numbered 1 to total cards)
4. **Play**: 
   - Select two card positions to flip
   - If they match, they stay flipped (marked with ✓)
   - If they don't match, they flip back after 2 seconds
   - Continue until all pairs are matched
5. **Win**: Match all pairs to win the game!

## Example Gameplay

```
Card Positions:
  [ 1] [ 2] [ 3] [ 4]
  [ 5] [ 6] [ 7] [ 8]
  [ 9] [10] [11] [12]
  [13] [14] [15] [16]

  ?  ?  ?  ?
  ?  ?  ?  ?
  ?  ?  ?  ?
  ?  ?  ?  ?

Matched: 0/8
Moves: 0
─────────────────────────────────────────
Enter first card position (1-16): 1
Enter second card position (1-16): 9
```

## Card Display Symbols

- `?` - Unrevealed card
- `Number` - Revealed card (shows the pair number)
- `✓` - Matched card (pair found)

## Game Rules

- Each card can only be selected once per turn
- Two cards must be selected each turn
- Matching pairs stay revealed
- Non-matching cards flip back after 2 seconds
- Game ends when all pairs are matched

## Requirements

- Java Development Kit (JDK) 8 or higher

## Tips for Winning

- Try to remember the positions of cards you've seen
- Look for patterns in card placement
- Complete the game with minimum moves for a better score

## Author

Created as a mini project to demonstrate Java programming concepts including object-oriented design, game logic, and user interaction.
