/**
 * 
 */
package com.example.demo;

import java.time.Duration;
import java.time.Instant;

/**
 * @author Chiraj
 *
 */
public class SudokuSolver {

	private static Instant start;
	private static Instant end;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int[][] board = {
				{ 8, 0, 0, 7, 5, 3, 0, 0, 0 },
				{ 0, 0, 3, 6, 0, 0, 0, 0, 0 },
				{ 0, 7, 0, 0, 9, 0, 2, 0, 0 },
				{ 0, 5, 0, 0, 0, 7, 0, 0, 0 },
				{ 0, 0, 0, 0, 4, 5, 7, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0, 3, 0 },
				{ 0, 0, 1, 0, 0, 0, 0, 6, 8 },
				{ 0, 0, 8, 5, 0, 0, 0, 1, 0 },
				{ 0, 9, 0, 0, 0, 0, 4, 0, 0 } 
		};
		
		
		
		printit(board);

		executionStart();
		if(solve(new SudokuBoard(board))) {
			System.out.println("Solved the puzzle !!");
		}
		else {
			System.out.println("Unsolvable :(");
		}
		executionEnd();
		printit(board);
	}
	
	public String sudoku() {
		// TODO Auto-generated method stub
		
		int[][] board = {
				{ 8, 0, 0, 7, 5, 3, 0, 0, 0 },
				{ 0, 0, 3, 6, 0, 0, 0, 0, 0 },
				{ 0, 7, 0, 0, 9, 0, 2, 0, 0 },
				{ 0, 5, 0, 0, 0, 7, 0, 0, 0 },
				{ 0, 0, 0, 0, 4, 5, 7, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0, 3, 0 },
				{ 0, 0, 1, 0, 0, 0, 0, 6, 8 },
				{ 0, 0, 8, 5, 0, 0, 0, 1, 0 },
				{ 0, 9, 0, 0, 0, 0, 4, 0, 0 } 
		};
		
		printit(board);

		executionStart();
		SudokuBoard sudokuBoard = new SudokuBoard(board);
		if(solve(sudokuBoard)) {
			sudokuBoard.setResultMessage("Solved the puzzle !!");
			System.out.println(sudokuBoard.getResultMessage());
		}
		else {
			sudokuBoard.setResultMessage("Unsolvable :(");
			System.out.println(sudokuBoard.getResultMessage());
		}
		executionEnd();
		printit(board);
		
		return sudokuBoard.toString();
	}

	private static void executionEnd() {
		end = Instant.now();
		long time = Duration.between(start, end).toMillis();
		System.out.println("Execution in - "+ time + "ms");
	}

	private static void executionStart() {
		start = Instant.now();
	}

	private static void printit(int[][] board) {
		// TODO Auto-generated method stub

		for(int i=0; i<9 ; i++) {
			if(i%3==0 && i!=0) {
				System.out.println("------------------------");
			}
			for(int j=0; j<9 ; j++) {
				if(j%3==0 && j!=0) {
					System.out.print(" | ");					
				}
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}

	private static boolean isValidRow(int[][] board, int row, int col, int number) {
		for(int i=0; i<9 ; i++) {
			if((board[i][col])==number && i!=row) {
				return false;
			}
		}
		return true;
	}

	private static boolean isValidColoumn(int[][] board, int row, int col, int number) {
		for(int i=0; i<9 ; i++) {
			if((board[row][i])==number && i!=col) {
				return false;
			}
		}
		return true;
	}

	private static boolean isValidBox(int[][] board, int row, int col, int number) {
		int r = row - row%3;
		int c = col - col%3;
		for(int i=r; i<r+3 ; i++) {
			for(int j=c; j<c+3 ; j++) {
				if((board[i][j])==number && j!=col && i!=row) {
					return false;
				}
			}
		}
		return true;
	}

	private static boolean solve(SudokuBoard sudokuBoard) {

		for(int i=0; i<9 ; i++) {
			for(int j=0; j<9 ; j++) {
				if(sudokuBoard.getValue(i,j) == 0) {
					for(int k=1; k<10 ; k++) {
						sudokuBoard.setValue(i,j,k);
						if(isValidRow(sudokuBoard.getArray(), i, j, k) && isValidColoumn(sudokuBoard.getArray(), i, j, k) && isValidBox(sudokuBoard.getArray(), i, j, k) && solve(sudokuBoard)) {
							return true;
						}
						sudokuBoard.setValue(i,j,0);
					}
					return false;		
				}
			}
		}
		return true;

	}

}
