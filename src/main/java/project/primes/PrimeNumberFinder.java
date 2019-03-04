package main.java.project.primes;

import java.util.ArrayList;
import java.util.List;

/**
 * Implements two approaches for finding prime numbers
 * 1. Using primality test for each number till n primes are found (Used here)
 * 2. Using a precomputed limit and finding all the numbers in that limit
 * 
 * @author ajinkyaawchat
 *
 */
public class PrimeNumberFinder {

	/**
	 * Find the first N prime numbers using the sieve approach. ie. finding the
	 * primes till N.log(N)
	 * 
	 * @param n
	 * @return
	 * @deprecated
	 */
	public List<Integer> firstNPrimesSieve(int n) {
		List<Integer> primes = new ArrayList<>(n);
		int limit = (int) (n * log2n(n));
		boolean[] composites = new boolean[limit];

		int primesCount = 0;
		for (int i = 2; i < limit; i++) {
			if (!composites[i]) {
				if (isPrime(i)) {
					primesCount++;
					primes.add(i);
					
					if(primesCount == n)
						break;
				}
				else {
					composites[i] = true;
					
				}
				for (int j = 2; (j * i) < limit; j++)
					composites[j * i] = true;
			}
		}
		return primes;
	}

	private int log2n(int n) {
		return n > 1 ? 1 + log2n(n / 2) : 0;
	}

	/**
	 * Finds the first N prime numbers using the primality test
	 * Checks each 
	 * @param n
	 * @return
	 */
	public List<Integer> firstNPrimes(int n) {
		List<Integer> primes = new ArrayList<>(n);
		int num = 2, count = 0;
		while (count != n) {
			if (isPrime(num)) {
				count++;
				primes.add(num);
			}
			num++;
		}
		return primes;
	}

	private boolean isPrime(int n) {
		if (n % 2 == 0)
			return n == 2; // removes composites & even numbers early on
		if (n % 3 == 0)
			return n == 3; // removes composites divisible by 3 early on
		if (n % 5 == 0)
			return n == 5; // removes composites divisible by 5 early on

		int step = 4;
		int m = (int) Math.sqrt(n) + 1;

		for (int i = 5; i < m; step = 6 - step, i += step) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}
}
