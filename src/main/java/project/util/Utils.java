package main.java.project.util;

import java.util.ArrayList;
import java.util.List;

public class Utils {
	public static List<List<Integer>> convertArrayToList(int[][] arr) {
		List<List<Integer>> result = new ArrayList<>();
		int rows = arr == null ? 0 : arr.length;
		
		for(int i = 0; i < rows; i++) {
			int cols = arr[i] == null ? 0: arr[i].length;
			List<Integer> row = new ArrayList<>(cols);
			for(int j = 0; j < cols; j++) {
				row.add(arr[i][j]);
			}
			result.add(row);
		}
		return result;
	}
}
