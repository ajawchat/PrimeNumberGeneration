package main.java.project.display;

import java.util.List;

public class ConsoleMatrixDisplayer implements MatrixDisplayer {
	private final int WIDTH = 6;

	/**
	 * Displays the tabular representation of the matrix with header on the first row and the first column
	 */
	@Override
	public <T, U> void display(List<T> headers, List<List<U>> matrix) {
		if (matrix == null) {
			throw new IllegalArgumentException("Invalid matrix provided");
		}

		int rows = matrix.isEmpty() ? 0 : matrix.size();

		String format = "| %-" + WIDTH + "d";
		System.out.format("| %-" + WIDTH + "s", "*");
		
		printSingleRow(headers, format);
		printRowSeparator(headers.size());

		for (int i = 0; i < rows; i++) {
			System.out.format(format, headers.get(i));
			printSingleRow(matrix.get(i), format);
		}
		
		printRowSeparator(headers.size());
	}
	
	/**
	 * Helper function to print a single row
	 * @param row
	 * @param format
	 */
	private <T> void printSingleRow(List<T> row, String format) {
		for (int i = 0; i < row.size(); i++) {
			System.out.format(format, row.get(i));
		}
		System.out.println("|");
	}
	
	/**
	 * Prints a horizontal line to the console
	 * @param rowSize
	 */
	private void printRowSeparator(int rowSize) {
		int cols = rowSize + 1;
		int sep = (WIDTH + 1) * cols + (cols + 1);
		StringBuilder rowSeparator = new StringBuilder();
		while (sep-- > 0) {
			rowSeparator.append("-");
		}
		System.out.println(rowSeparator.toString());
	}

}
