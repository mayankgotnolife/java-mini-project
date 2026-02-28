// Tic Tac Toe Game
// A classic 3x3 grid game where two players take turns marking spaces
// First player to get 3 in a row (horizontally, vertically, or diagonally) wins

import java.util.Scanner;

public class TicTacToe {
    
    private char[][] board;
    private char currentPlayer;
    private boolean gameOver;
    private int moveCount;
    
    // Constructor
    public TicTacToe() {
        this.board = new char[3][3];
        this.currentPlayer = 'X';
        this.gameOver = false;
        this.moveCount = 0;
        initializeBoard();
    }
    
    // Initialize empty board
    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }
    
    // Display the game board
    public void displayBoard() {
        System.out.println("\n");
        System.out.println("     0   1   2");
        System.out.println("   +---+---+---+");
        
        for (int i = 0; i < 3; i++) {
            System.out.print(" " + i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + board[i][j] + " ");
            }
            System.out.println("|");
            System.out.println("   +---+---+---+");
        }
        System.out.println();
    }
    
    // Display board position guide
    public void displayPositionGuide() {
        System.out.println("\nPosition Guide:");
        System.out.println("     0   1   2");
        System.out.println("   +---+---+---+");
        
        for (int i = 0; i < 3; i++) {
            System.out.print(" " + i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + i + j + " ");
            }
            System.out.println("|");
            System.out.println("   +---+---+---+");
        }
        System.out.println();
    }
    
    // Get player's move
    public boolean makeMove(Scanner scanner) {
        boolean validMove = false;
        
        while (!validMove) {
            System.out.print("Player " + currentPlayer + ", enter your position (format: row col): ");
            
            try {
                int row = scanner.nextInt();
                int col = scanner.nextInt();
                
                if (row < 0 || row > 2 || col < 0 || col > 2) {
                    System.out.println("Invalid position! Please enter row and column between 0 and 2.");
                    continue;
                }
                
                if (board[row][col] != ' ') {
                    System.out.println("Position already occupied! Try another position.");
                    continue;
                }
                
                board[row][col] = currentPlayer;
                moveCount++;
                validMove = true;
                
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter two numbers between 0 and 2.");
                scanner.nextLine(); // Clear invalid input
            }
        }
        
        return validMove;
    }
    
    // Check if current player has won
    public boolean checkWin() {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && 
                board[i][1] == currentPlayer && 
                board[i][2] == currentPlayer) {
                return true;
            }
        }
        
        // Check columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == currentPlayer && 
                board[1][j] == currentPlayer && 
                board[2][j] == currentPlayer) {
                return true;
            }
        }
        
        // Check diagonal (top-left to bottom-right)
        if (board[0][0] == currentPlayer && 
            board[1][1] == currentPlayer && 
            board[2][2] == currentPlayer) {
            return true;
        }
        
        // Check diagonal (top-right to bottom-left)
        if (board[0][2] == currentPlayer && 
            board[1][1] == currentPlayer && 
            board[2][0] == currentPlayer) {
            return true;
        }
        
        return false;
    }
    
    // Check if board is full (draw)
    public boolean isBoardFull() {
        return moveCount == 9;
    }
    
    // Switch to other player
    public void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }
    
    // Play the game
    public void play() {
        Scanner scanner = new Scanner(System.in);
        
        displayWelcome();
        displayPositionGuide();
        
        while (!gameOver) {
            displayBoard();
            
            // Get player move
            makeMove(scanner);
            
            // Check if current player won
            if (checkWin()) {
                displayBoard();
                System.out.println("🎉 Player " + currentPlayer + " WINS! 🎉");
                gameOver = true;
            } 
            // Check if board is full (draw)
            else if (isBoardFull()) {
                displayBoard();
                System.out.println("🤝 It's a DRAW! 🤝");
                gameOver = true;
            } 
            // Switch to other player
            else {
                switchPlayer();
            }
        }
        
        scanner.close();
    }
    
    // Display welcome message
    public void displayWelcome() {
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║         WELCOME TO TIC TAC TOE         ║");
        System.out.println("║                                        ║");
        System.out.println("║    Player X vs Player O (Human)        ║");
        System.out.println("║    First to get 3 in a row wins!       ║");
        System.out.println("╚════════════════════════════════════════╝");
    }
    
    // Main method
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }
}
