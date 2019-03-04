package test.java.project.math;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

import main.java.project.math.Multiplier;

public class MultiplierTest {
	@Test
	public void firstNPrimesTest() {
		Multiplier multiplier = new Multiplier();
		List<Integer> input = Arrays.asList(1, 2, 3);
		int[][] expected = { { 1, 2, 3 }, 
							 { 2, 4, 6 }, 
							 { 3, 6, 9 } };
		int[][] actual = multiplier.multiply(input);
		Assert.assertArrayEquals(expected, actual);
	}
}