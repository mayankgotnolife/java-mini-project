# Simple Memory Game (Geeks)

A basic console-based memory card matching game built with Java. This is a simplified version of the classic memory game where players flip cards to find matching pairs.

## Game Description

This is a beginner-friendly memory card game with 4 pairs of cards (A, B, C, D). Players take turns flipping two cards at a time and trying to find matching pairs. Once all 4 pairs are found, the game is won.

## Features

- **Simple Gameplay**
  - 8 cards total (4 pairs)
  - Easy-to-understand rules
  - Input validation for card selection

- **Card Matching**
  - Flip two cards per round
  - Match pairs (A-A, B-B, C-C, D-D)
  - Cards remain unmatched if they're different

- **User-Friendly Interface**
  - Clear board display with indices
  - Step-by-step card flipping
  - Instant feedback on matches

## Class Structure

- **`Geeks.java`** - Main game class with complete game logic

## How to Compile and Run

### Compilation
```bash
javac Geeks.java
```

### Run the Game
```bash
java Geeks
```

## How to Play

1. **Start the Game**: Run `java Geeks`
2. **View Board**: The game board will be displayed with 8 card positions (indices 0-7)
3. **Play**: 
   - Enter the index of the first card to flip (0-7)
   - Enter the index of the second card to flip (0-7)
   - If cards match, they stay revealed
   - If cards don't match, they flip back
4. **Win**: Match all 4 pairs to win the game!

## Example Gameplay

```
Welcome to the Memory Game!
| |  |  |  |  |  |  |  |  |
Enter index of first card to flip:
0
| A |  |  |  |  |  |  |  |  |
Enter index of second card to flip:
5
| A |  |  |  |  | A |  |  |  |
You found a pair!
...
Congratulations, you won!
```

## Card Display

- `| |` - Unflipped card (empty space)
- `| A |`, `| B |`, `| C |`, `| D |` - Flipped card showing its letter

## Game Rules

- Enter indices between 0 and 7 for card positions
- Cards must not be already flipped
- Two cards are flipped per turn
- If cards match, they remain revealed
- If cards don't match, they flip back and turn continues
- Game ends when all 4 pairs are matched

## Card Pairs

The game has these 4 pairs:
- Pair 1: A & A
- Pair 2: B & B
- Pair 3: C & C
- Pair 4: D & D

## Requirements

- Java Development Kit (JDK) 8 or higher

## Tips for Winning

- Remember the positions and letters of cards you've seen
- Build mental maps of the board
- Try to match pairs quickly with strategic flips

## Author

Created as a beginner mini project to demonstrate basic Java concepts including ArrayLists, arrays, and game logic.
