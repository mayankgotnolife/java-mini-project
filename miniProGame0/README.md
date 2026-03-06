# Tic Tac Toe Game

A classic console-based Tic Tac Toe game built with Java. Two players take turns marking spaces on a 3x3 grid, and the first player to get three in a row wins!

## Game Description

This is a traditional Tic Tac Toe game where two human players (X and O) compete on a 3x3 grid. Players alternate taking turns placing their mark, and the first to achieve three in a row horizontally, vertically, or diagonally wins the game. If all 9 spaces are filled without a winner, the game ends in a draw.

## Features

- **Two-Player Gameplay**
  - Player X vs Player O
  - Human vs Human gameplay
  - Player validation and turn switching

- **Win Conditions**
  - Horizontal wins (3 in a row)
  - Vertical wins (3 in a column)
  - Diagonal wins (both directions)
  - Draw detection (board full)

- **User-Friendly Interface**
  - Clear 3x3 grid display
  - Position guide for easy move input
  - Input validation
  - Instant feedback on moves

## Class Structure

- **`TicTacToe.java`** - Main game class with complete game logic

## How to Compile and Run

### Compilation
```bash
javac TicTacToe.java
```

### Run the Game
```bash
java TicTacToe
```

## How to Play

1. **Start the Game**: Run `java TicTacToe`
2. **View Position Guide**: The game displays position numbers (0-8) for reference
3. **Take Turns**: 
   - Player X goes first
   - Enter row and column (example: `0 0` for top-left)
   - Valid positions are 0-2 for both row and column
4. **Win or Draw**: 
   - First to get 3 in a row wins
   - If all positions are filled without a winner, it's a draw

## Example Gameplay

```
WELCOME TO TIC TAC TOE
Player X vs Player O (Human)
First to get 3 in a row wins!

Position Guide:
     0   1   2
   +---+---+---+
 0 | 0 0 | 0 1 | 0 2 |
   +---+---+---+
 1 | 1 0 | 1 1 | 1 2 |
   +---+---+---+
 2 | 2 0 | 2 1 | 2 2 |
   +---+---+---+

     0   1   2
   +---+---+---+
 0 |   |   |   |
   +---+---+---+
 1 |   |   |   |
   +---+---+---+
 2 |   |   |   |
   +---+---+---+

Player X, enter your position (format: row col): 0 0

     0   1   2
   +---+---+---+
 0 | X |   |   |
   +---+---+---+
 1 |   |   |   |
   +---+---+---+
 2 |   |   |   |
   +---+---+---+

Player O, enter your position (format: row col): 1 1
...
```

## Board Positions

Positions are entered as `row col` where:
```
Row 0: columns 0, 1, 2 (top row)
Row 1: columns 0, 1, 2 (middle row)
Row 2: columns 0, 1, 2 (bottom row)
```

## Game Rules

- Players alternate turns (X starts first)
- Each position can only be filled once
- Entering invalid positions prompts for re-entry
- First player to get 3 marks in a row/column/diagonal wins
- Game ends in draw if board fills without a winner

## Win Conditions

- **Horizontal**: Same row with all three positions marked
- **Vertical**: Same column with all three positions marked
- **Diagonal**: Same diagonal line (top-left to bottom-right OR top-right to bottom-left)

## Requirements

- Java Development Kit (JDK) 8 or higher

## Tips for Winning

- Control the center (position 1,1) - it's part of 4 winning combinations
- Block opponent's winning moves
- Create multiple threats to force opponent into bad positions
- Watch for diagonal opportunities

## Author

Created as a mini project to demonstrate Java programming concepts including 2D arrays, game logic, and user interaction.

