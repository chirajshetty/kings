package com.example.demo;

public class SudokuBoard {


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

	/**
	 * @return the board
	 */
	public int getValue(int row, int col) {
		return board[row][col];
	}

	/**
	 * @return the board
	 */
	public int[][] getArray() {
		return board;
	}

	/**
	 * @param board the board to set
	 */
	public void setValue(int[][] board) {
		this.board = board;
	}

	/**
	 * @param board the board to set
	 */
	public void setValue(int row, int col, int number) {
		this.board[row][col] = number;
	}

	/**
	 * @return the resultMessage
	 */
	public String getResultMessage() {
		return resultMessage;
	}

	/**
	 * @param resultMessage the resultMessage to set
	 */
	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	@Override
	public String toString() {
		return "SudokuBoard [board=" + boardString(board) + ", resultMessage=" + resultMessage + "]";
	}

	private String boardString(int[][] board2) {
		// TODO Auto-generated method stub
		StringBuilder stb = new StringBuilder();
		for(int[] arr : board2) {
			for(int val : arr) {
				stb.append(val + " ");
			}
			stb.append(",");
		}
		return stb.toString();
	}

}
