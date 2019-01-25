package geometrycalculator;

// https://en.wikipedia.org/wiki/List_of_formulas_in_elementary_geometry and https://www.calculatorsoup.com/calculators/geometry-solids/geometricshapes.php
import java.util.Scanner;

public class GeometryCalculatorMenu {

	// Prompts user to choose shape and format, does calculations, and prints result
	public static void main(String[] args) throws InterruptedException {
		GeometryCalculator calc = new GeometryCalculator();
		Scanner sc = new Scanner(System.in);
		double length1, length2, length3, length4, length5, length6, length7, length8;
		boolean shouldContinue = true;
		do {
			System.out.print("Enter a shape! ---> ");
			String str = sc.next();

			switch (str.toUpperCase()) {
			case "SQUARE":
			case "SQR":
			case "SQ":
				System.out.print("Enter a side length ---> ");
				length1 = sc.nextDouble();
				System.out.println("Area of square = " + calc.squareArea(length1) + 
						", Perimeter of square = " + calc.squarePerimeter(length1) + "\n");
				Thread.sleep(1000);
				break;
			case "RECTANGLE":
			case "RECT":
				System.out.print("Enter the first side length ---> ");
				length1 = sc.nextDouble();
				System.out.print("Enter the second side length ---> ");
				length2 = sc.nextDouble();
				System.out.println("Area of rectangle = " + calc.rectArea(length1, length2) + 
						", Perimeter of rectangle = " + calc.rectPerimeter(length1, length2) + "\n");
				Thread.sleep(1000);
				break;
			case "CIRCLE":
			case "CIRC":
			case "CIR":
				System.out.print("Enter the radius ---> ");
				length1 = sc.nextDouble();
				System.out.println("Area of circle = " + calc.circArea(length1) + 
						", Circumference of circle = " + calc.circCircumf(length1));
				Thread.sleep(1000);
				break;
			case "LEAVE":
			case "QUIT":
			case "EXIT":
			case "STOP":
			case "ST":
			case "L":
			case "Q":
			case "E":
			case "S":
				System.out.println("Quitting now.");
				sc.close();
				shouldContinue = false;
				break;
			default:
				System.out.println("I'm sorry, that wasn't an option! Please try again.\n");
				Thread.sleep(1000);
				break;
			}
		} while (shouldContinue);
	}

}
