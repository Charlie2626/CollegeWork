package programs;
import java.util.Scanner;

public class Area {

	public static void main(String[] args) {

		// Variables
		Scanner input = new Scanner(System.in);
		double base;
		double height;
		double area;
		
		//Get data from user 
		System.out.print("Enter base: ");
		base = input.nextDouble();
		System.out.print("Enter height: ");
		height = input.nextDouble();
		input.close();
		
		//Calculate area ;
		area = (base * height) / 2;
		
		//Display area
		System.out.print("Area is: " + area);
	}
}