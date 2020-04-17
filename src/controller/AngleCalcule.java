package controller;

import view.ConsoleReadOut;

public class AngleCalcule {

	public AngleCalcule() {
		// TODO Auto-generated constructor stub
	}
	
	//THIS ACTUALLY CALCULATES DISTANCE!!!
	public void LengthCalculator(int x1, int y1, int x2, int y2) {
		
		
		int higherX;
		int higherY;
		
		int lowerX;
		int lowerY;
		
		//makes sure the higher X value is at the start of the calculation
		if(x1 > x2) {
			higherX = x1;
			lowerX = x2;
		}
		else {
			higherX = x2;
			lowerX = x1;
		}
		
		//makes sure the higher Y value is at the start of the calculation
		if(y1 > y2) {
			higherY = y1;
			lowerY = y2;
		}
		else {
			higherY = y2;
			lowerY = y1;
		}
		
		int triLength = higherX - lowerX;
		int triWidth = higherY - lowerY;
		
		double squaredResult = (triLength * triLength) + (triWidth * triWidth);
		
		squaredResult = Math.sqrt(squaredResult);
		
		String consoleSend= "Calculated Length: " + squaredResult;
		
		ConsoleReadOut.ConsoleReadIn(consoleSend);
		
	}
	
	public double AngleCalculator(int x1, int y1, int x2, int y2) {
		
		return 0.0;
	}

}
