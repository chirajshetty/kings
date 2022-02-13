package com.example.demo.sudoku.data;

public interface ISudokuBoard {

	/**
	 * @return the board
	 */
	int[][] getArray();

	/**
	 * @return the resultMessage
	 */
	String getResultMessage();

	/**
	 * @return the board
	 */
	int getValue(int row, int col);

	/**
	 * @param resultMessage the resultMessage to set
	 */
	void setResultMessage(String resultMessage);

	/**
	 * @param board the board to set
	 */
	void setValue(int row, int col, int number);

	/**
	 * @param board the board to set
	 */
	void setValue(int[][] board);

	@Override
	String toString();

}