package test.java.project.primes;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import main.java.project.primes.PrimeNumberFinder;

public class PrimeNumberFinderTest {
	
	@Test
	public void firstNPrimesTest() {
		PrimeNumberFinder primeNumberFinder = new PrimeNumberFinder();
		List<Integer> expected = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
		List<Integer> actual = primeNumberFinder.firstNPrimes(10);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void firstNPrimesSieveTest() {
		PrimeNumberFinder primeNumberFinder = new PrimeNumberFinder();
		List<Integer> expected = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
		List<Integer> actual = primeNumberFinder.firstNPrimesSieve(10);
		Assert.assertEquals(expected, actual);
	}	
}
