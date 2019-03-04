package main.java.project.math;

import java.util.List;

/**
 * Takes in a list of numbers and returns a matrix by multiplying each number with other numbers in the list  
 * @author ajinkyaawchat
 *
 */
public class Multiplier {
	public int[][] multiply(List<Integer> numbers) {
		if (numbers == null) {
			throw new IllegalArgumentException("Invalid list of numbers provided");
		}

		int size = numbers.size();

		int[][] matrix = new int[size][size];

		for (int i = 0; i < size; i++) {
			for (int j = i; j < size; j++) {
				int product = numbers.get(i) * numbers.get(j);
				matrix[i][j] = product;
				matrix[j][i] = product;
			}
		}

		return matrix;
	}
}
