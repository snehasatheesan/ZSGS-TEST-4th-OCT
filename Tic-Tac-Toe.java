package test;

import java.util.Scanner;

public class TicTacToe {
    private char[][] board;
    private char Player1;
    public TicTacToe() {
        board = new char[3][3];
        Player1 = 'X'; // Player 1 starts with 'X'
        initializeBoard();
    }

    
private void initializeBoard() {
	
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '_';
            }
        }
    }


private void displayBoard() {
    
}


private void switchPlayer() {
    Player1 = (Player1 == 'X') ? 'O' : 'X';
}

public void playGame(boolean displayBoard) {
	
        while (true) {
        displayBoard();
        if (displayBoard) {
            
            System.out.println("Congratulations, Player " + (Player1 == 'X' ? "1 (X)" : "2 (O)") + " wins!");
            break;
        }
        
        if (displayBoard) {
            
            System.out.println("It's a draw!");
            break;
        }

        switchPlayer();
    }
        }
        public static void main(String[] args) {
            TicTacToe game = new TicTacToe();
            game.playGame();
}

		
}
