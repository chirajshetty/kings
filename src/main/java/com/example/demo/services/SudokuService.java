/**
 * 
 */
package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.sudoku.SudokuSolver;

/**
 * @author Chiraj
 *
 */
@Service
public class SudokuService implements ISudokuService {

	@Override
	public String solveSudoku() {
		SudokuSolver sudokuSolver = new SudokuSolver();
		return sudokuSolver.sudoku();
	}

	@Override
	public String solveSudokuByBoard(int[][] board) {
		SudokuSolver sudokuSolver = new SudokuSolver();
		if (board == null) {
			return sudokuSolver.sudoku(board);
		}
		return sudokuSolver.sudoku();
	}
}
