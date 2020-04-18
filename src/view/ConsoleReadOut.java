package view;

import java.util.Scanner;

import controller.AngleCalcule;

public class ConsoleReadOut {

	public ConsoleReadOut() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("GDS Test Here");
		
		String ConsoleLineTest = "System Test";
		ConsoleReadIn(ConsoleLineTest);
		
		Scanner keyInput = new Scanner(System.in);
		
		System.out.println("Enter X1");
		int x1 = keyInput.nextInt();
		
		System.out.println("Enter Y1");
		int y1 = keyInput.nextInt();
		
		
		System.out.println("Enter X2");
		int x2 = keyInput.nextInt();
		
		System.out.println("Enter Y2");
		int y2 = keyInput.nextInt();
		
		
		AngleCalcule calculate = new AngleCalcule();
		calculate.LengthCalculator(x1, y1, x2, y2);
		
		double angle = calculate.AngleCalculator(x1, y1, x2, y2);
		
		String coordinateEntered = "Coordinates entered are, X1: " + x1 + ", Y1: " + y1 + ", X2: " + x2 + ", Y2: " + y2;
		ConsoleReadIn(coordinateEntered);
		
		System.out.println("Angle is: " + angle);
		
	}
	
	public static void ConsoleReadIn(String ConsoleLine) {
		System.out.println("System message: " + ConsoleLine);
	}

}
