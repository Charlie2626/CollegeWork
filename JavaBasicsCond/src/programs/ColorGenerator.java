package programs;

import java.util.Scanner;

public class ColorGenerator {

	public static void main(String[] args) {
		
		// Variables
		Scanner input = new Scanner(System.in);
		String red;
		String blueAndGreen;
		String finalColor;
		
		//Gather data
		System.out.print("Do you want red? (Yes/Yeah/No): ");
		red = input.next();
		System.out.print("Do you want green and blue? (Yes/Yeah/No): ");
		blueAndGreen = input.next();
		input.close();
		
		//Determine color combination 
		if ( red.compareTo("Yes") == 0) {
			red = "FF";
		} else if(red.compareTo("Yeah") == 0) {
			red = "FF";
		} else {
			red = "00";
		}
		
		if ( blueAndGreen.compareTo("Yes") == 0) {
			blueAndGreen = "FFFF";
		} else if (blueAndGreen.compareTo("Yeah") == 0) {
			blueAndGreen = "FFFF";
		} else {
			blueAndGreen = "0000";
		}
		finalColor = "#" + red + blueAndGreen;
		
		//Print result
		System.out.print("Final Color: " + finalColor);
	
	}
}