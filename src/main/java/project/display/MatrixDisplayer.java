package main.java.project.display;

import java.util.List;

/**
 * Interface for different types of displays
 * @author ajinkyaawchat
 *
 */

public interface MatrixDisplayer {
	public <T, U> void display(List<T> headers, List<List<U>> matrix);
}
