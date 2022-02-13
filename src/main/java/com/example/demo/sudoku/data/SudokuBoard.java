package com.example.demo.sudoku.data;

public class SudokuBoard implements ISudokuBoard {

	private int[][] board;
	private String resultMessage;

	/**
	 * 
	 */
	public SudokuBoard() {
		super();
	}

	/**
	 * @param board
	 */
	public SudokuBoard(int[][] board) {
		super();
		this.board = board;
	}

	private String boardString(int[][] board2) {
		// TODO Auto-generated method stub
		StringBuilder stb = new StringBuilder();
		for (int[] arr : board2) {
			for (int val : arr) {
				stb.append(val + " ");
			}
			stb.append(",");
		}
		return stb.toString();
	}

	/**
	 * @return the board
	 */
	@Override
	public int[][] getArray() {
		return board;
	}

	/**
	 * @return the resultMessage
	 */
	@Override
	public String getResultMessage() {
		return resultMessage;
	}

	/**
	 * @return the board
	 */
	@Override
	public int getValue(int row, int col) {
		return board[row][col];
	}

	/**
	 * @param resultMessage the resultMessage to set
	 */
	@Override
	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	/**
	 * @param board the board to set
	 */
	@Override
	public void setValue(int row, int col, int number) {
		this.board[row][col] = number;
	}

	/**
	 * @param board the board to set
	 */
	@Override
	public void setValue(int[][] board) {
		this.board = board;
	}

	@Override
	public String toString() {
		return "SudokuBoard [board=" + boardString(board) + ", resultMessage=" + resultMessage + "]";
	}

}
