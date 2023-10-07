package programs;
import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
		
		// Variables
		Scanner input = new Scanner(System.in);
		int x;
		int y;		
		
		//Gather data
		System.out.print("Enter x: ");
		x = input.nextInt();
		System.out.print("Enter y: ");
		y = input.nextInt();
		input.close();
		
		//Calculate remainder
				
		// Print result based on remainder
		if ((x % y) == 0 )
		{
			System.out.println("Remainder: " + (x % y));
			System.out.print(x + " is divisible by " + y);
		} else {
			System.out.println("Remainder: " + (x % y));
			System.out.print(x + " is NOT divisible by " + y);
		}
		
		
		
		
	}
}