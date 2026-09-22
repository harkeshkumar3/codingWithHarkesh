//package org.example.LowLevelDesignQuestions.LLDTicTacToe;
//
//import com.LowLevelDesignQuestions.LLDTicTacToe.Model.*;
//import javafx.util.Pair;
//
//import java.util.Deque;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Scanner;
//
//public class TicTacToeGame {
//
//    public Deque<Player> players;
//    public Board gameBoard;
//
//    public void initializeGame() {
//
//        players = new LinkedList<>();
//        PlayingPieceX playingPieceX = new PlayingPieceX();
//        Player playerX = new Player("player1", playingPieceX);
//
//        PlayingPieceO playingPieceO = new PlayingPieceO();
//        Player playerO = new Player("Player 2", playingPieceO);
//
//        players.add(playerO);
//        players.add(playerX);
//
//        gameBoard = new Board(3);
//
//    }
//
//    public String startGame() {
//        boolean noWinner = true;
//        while (noWinner) {
//            Player playerTurn = players.removeFirst();
//            gameBoard.printBoard();
//
//            List<Pair<Integer, Integer>> freeSpaces = gameBoard.getFreeCells();
//            if (freeSpaces.isEmpty()) {
//                noWinner = false;
//                continue;
//            }
//
//            System.out.println("Player: " + playerTurn.name + "Enter row, Column");
//            Scanner input = new Scanner(System.in);
//            String s = input.nextLine();
//            String[] values = s.split(",");
//            int inputRow = Integer.valueOf(values[0]);
//            int inputColumn = Integer.valueOf(values[1]);
//
//            boolean pieceAddedSuccessfully = gameBoard.addPiece(inputRow, inputColumn, playerTurn.playingPiece);
//            if (!pieceAddedSuccessfully) {
//                System.out.println("Incorrect position Chosen, try again");
//                players.addFirst(playerTurn);
//                continue;
//            }
//
//            players.addLast(playerTurn);
//            boolean winner = isThereWinner(inputRow, inputColumn, playerTurn.playingPiece.pieceType);
//            if (winner) {
//                return playerTurn.name;
//            }
//
//        }
//
//        return "tie";
//    }
//
//    private boolean isThereWinner(int inputRow, int inputColumn, PieceType pieceType) {
//        boolean rowMatch = true;
//        boolean columnMatch = true;
//        boolean diagonalMatch = true;
//        boolean antiDiagonalMatch = true;
//
//        for (int i = 0; i < gameBoard.size; i++) {
//            if (gameBoard.board[inputRow][i] == null || gameBoard.board[inputRow][i].pieceType != pieceType) {
//                rowMatch = false;
//            }
//        }
//        for (int i = 0; i < gameBoard.size; i++) {
//            if (gameBoard.board[i][inputColumn] == null || gameBoard.board[i][inputColumn].pieceType != pieceType) {
//                columnMatch = false;
//            }
//        }
//        for (int i = 0, j = 0; i < gameBoard.size; i++, j++) {
//            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
//                diagonalMatch = false;
//            }
//        }
//
//        for (int i = 0, j = gameBoard.size - 1; i < gameBoard.size; i++, j--) {
//            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
//                antiDiagonalMatch = false;
//            }
//        }
//
//        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
//    }
//}
