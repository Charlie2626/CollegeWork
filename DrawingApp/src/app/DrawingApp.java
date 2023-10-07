package app;

import java.util.Random;

public class DrawingApp {
	/*
	 * For every method remove the line with "throw ..." and implement the method.
	 * We are using "throw..." so your code does not display any compilation errors
	 * when you import the zip file. Also, if you don't implement a method you will
	 * see a white square (instead of green) in the submit server
	 */
	public static String getRectangle(int maxRows, int maxCols, char symbol) {
		
		String square = "";
		if (maxRows < 1 || maxCols < 1) {
			return null;
		}else {
			for ( int r = 0; r < maxRows; r++) {
				for (int c = 0; c < maxCols; c++) {
					square += symbol;
				}
				if (r != maxRows - 1)
				square += "\n";
			}
		}
		return square;
	}

	public static String getFlag(int size, char color1, char color2, char color3) {
		
		int maxCols = size * 5;
		int maxRows = size * 2;
		String result = "";
		
		if (size < 3) {
			return null;
		}
		
		for (int r = 1; r <= size; r++) {
			for (int c = 1; c <= maxCols; c++) {
				if ( c <= r) {
					result += color1;
				} else if (r == size || r == 1) {
					result += color2;
				} else {
					result += color3;
				}
			}
			result += "\n";
		}
		for (int r = 1; r <= size; r++) {
			for (int c = 1; c <= maxCols; c++) {
				if (size - c >= r -1) {
					result += color1;
				} else if (r == 1 || r == size) {
					result += color2;
				} else {
					result += color3;
				}
			}
			result += "\n";
		}
		return result.trim();
	}	

	public static String getHorizontalBars(int maxRows, int maxCols, int bars, char color1, char color2, char color3) {
		
		String result = "";
		if (isValidColor(color1) == false) {
			return null;
		} else if (isValidColor(color2) == false) {
			return null;
		}else if (isValidColor(color3) == false) {
			return null;
		}else if ((maxRows / bars) < 1) {
			return null;
		} else {
			for (int r = 0; r < bars; r++) {
				if (r % 3 == 0) {
					result += getRectangle(maxRows/bars, maxCols,color1);
				} else if (r % 3 == 1) {
					result += getRectangle(maxRows/bars, maxCols,color2);
				} else {
					result += getRectangle(maxRows/bars, maxCols,color3);
				}
				if (r != bars -1) {
					result += "\n";
				}
			}
		}
		return result;
	}

	public static String getVerticalBars(int maxRows, int maxCols, int bars, char color1, char color2, char color3) {
		
		int numOfColor = maxCols / bars;
		String result = "";
		
		
		if (isValidColor(color1) == false) {
			return null;
		} else if (isValidColor(color2) == false) {
			return null;
		}else if (isValidColor(color3) == false) {
			return null;
		}else if (numOfColor < 1) {
			return null;
		} else {
			for (int r = 1; r <= maxRows; r++) {
				for (int count = 1; count <= bars; count++) {
					for (int c = 1; c <= numOfColor; c++) {
						if (count % 3 == 1) {
							result += color1;
						} else if (count % 3 == 2) {
							result += color2;
						} else {
							result += color3;
						}
					}
				}
				result += "\n";
			}
		}
		return result.trim();
	}

	public static char getRandomColor(Random random) {
		
		int ColorNum = random.nextInt(6);
		
		char color = ' ';
		
		if (ColorNum == 0) {
			return color = 'R';
		}else if(ColorNum == 1) {
			return color = 'G';
		}else if(ColorNum == 2) {
			return color = 'B';
		}else if(ColorNum == 3) {
			return color = 'Y';
		}else if(ColorNum == 4) {
			return color = '*';
		}else if(ColorNum == 5) {
			return color = '.';
		}
		return color;
	}

	private static boolean isValidColor(char color) {
		
		boolean ToF = true;
		
		if (color == 'R') {
			ToF = true;
		}else if (color == 'G') {
			ToF = true;
		}else if (color == 'B') {
			ToF = true;
		}else if (color == 'Y') {
			ToF = true;
		}else if (color == '*') {
			ToF = true;
		}else if (color == '.') {
			ToF = true;
		}else {
			ToF = false;
		}
		return ToF;
	}
}