package main.java.project.entry;

import java.util.List;

import main.java.project.display.ConsoleMatrixDisplayer;
import main.java.project.display.MatrixDisplayer;
import main.java.project.math.Multiplier;
import main.java.project.primes.PrimeNumberFinder;
import main.java.project.util.Utils;

/**
 * Entry point for the program. This performs the validations, initializes the
 * dependencies and makes the calls to all the other classes
 * 
 * @author ajinkyaawchat
 *
 */
public class ApiEntry {

	public static void main(String[] args) {
		try {
			int num = Integer.parseInt(args[0]);

			if (num < 1) {
				throw new IllegalArgumentException();
			}

			// Initialize the dependencies required for running
			PrimeNumberFinder primeFinder = new PrimeNumberFinder();
			Multiplier multiplier = new Multiplier();
			MatrixDisplayer displayer = new ConsoleMatrixDisplayer();

			List<Integer> primeNumberList = primeFinder.firstNPrimes(num);
			int[][] multipliedNumbers = multiplier.multiply(primeNumberList);
			List<List<Integer>> multipliedList = Utils.convertArrayToList(multipliedNumbers);
			displayer.display(primeNumberList, multipliedList);

		} catch (Exception exception) {
			System.out.println("Please enter a valid integer greater than 0");
		}
	}
}
