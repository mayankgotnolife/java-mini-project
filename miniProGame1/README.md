# Mini Memory Game (Java)

This is a simple **console-based memory matching game** written in Java.

You play by flipping two cards at a time and trying to find all matching pairs.

## Game Rules

- The board contains **4 pairs of cards**: `A`, `B`, `C`, and `D`.
- At the start, all cards are **hidden**.
- On each turn:
  - You choose the **index** of the first card to flip.
  - You choose the **index** of the second card to flip.
  - If the two cards match, they **stay face up** and you gain a pair.
  - If they do not match, they are **flipped back face down**.
- The game ends when you have found **all 4 pairs**.

## How to Run

### Prerequisites

- Java Development Kit (JDK) 8 or later installed.
- `javac` and `java` available in your terminal (added to `PATH`).

### Compile

From the project directory:

```bash
javac miniProGame1.java
```

This will generate a `miniProGame1.class` file.

### Run

```bash
java miniProGame1
```

Follow the prompts in the console to enter the indices of the cards you want to flip.

## Files

- `miniProGame1.java` — main source file containing the game logic.
