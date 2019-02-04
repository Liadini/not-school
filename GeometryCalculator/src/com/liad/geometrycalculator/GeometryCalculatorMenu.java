package com.liad.geometrycalculator;

// https://en.wikipedia.org/wiki/List_of_formulas_in_elementary_geometry and https://www.calculatorsoup.com/calculators/geometry-solids/geometricshapes.php
import java.util.Scanner;

/*
 * Author: Liad Hermelin
 */

public class GeometryCalculatorMenu {

	// Prompts user to choose shape and format, does calculations, and prints result
	public static void main(String[] args) throws InterruptedException {
		GeometryCalculator calc = new GeometryCalculator();
		Scanner sc = new Scanner(System.in);
		double length1, length2, length3, length4, length5;
		boolean shouldContinue = true;
		do {
			System.out.print("Enter a shape/command! ---> ");
			String str = sc.next();

			switch (str.toUpperCase()) {
			case "SQUARE":
			case "SQR":
			case "SQ":
				System.out.print("Enter a side length ---> ");
				length1 = sc.nextDouble();
				System.out.println("Area of square = " + calc.squareArea(length1) + ", Perimeter of square = "
						+ calc.squarePerimeter(length1) + "\n");
				Thread.sleep(1000);
				break;
			case "RECTANGLE":
			case "RECT":
				System.out.print("Enter the first side length ---> ");
				length1 = sc.nextDouble();
				System.out.print("Enter the second side length ---> ");
				length2 = sc.nextDouble();
				System.out.println("Area of rectangle = " + calc.rectArea(length1, length2)
						+ ", Perimeter of rectangle = " + calc.rectPerimeter(length1, length2) + "\n");
				Thread.sleep(1000);
				break;
			case "CIRCLE":
			case "CIRC":
			case "CIR":
				System.out.print("Enter the radius ---> ");
				length1 = sc.nextDouble();
				System.out.println("Area of circle = " + calc.circArea(length1) + ", Circumference of circle = "
						+ calc.circCircumf(length1) + "\n");
				Thread.sleep(1000);
				break;
			case "ELLIPSE":
			case "ELLPSE":
			case "EllPS":
			case "ELPS":
				System.out.print("Enter the semimajor axis ---> ");
				length1 = sc.nextDouble();
				System.out.print("Enter the semiminor axis ---> ");
				length2 = sc.nextDouble();
				System.out.println("Area of ellipse = " + calc.ellipseArea(length1, length2) + "\n");
				Thread.sleep(1000);
				break;
			case "TRIANGLE":
			case "TRINGLE":
			case "TRI":
			case "TR":
				System.out.print("Enter the base ---> ");
				length1 = sc.nextDouble();
				System.out.print("Enter the height ---> ");
				length2 = sc.nextDouble();
				System.out.print("Would you also like to find the perimeter of the triangle? ---> ");
				if (sc.next().equalsIgnoreCase("yes") || sc.next().equalsIgnoreCase("y")) {
					System.out.print("Enter the base ---> ");
					length3 = sc.nextDouble();
					System.out.print("Enter the height ---> ");
					length4 = sc.nextDouble();
					System.out.print("Enter the height ---> ");
					length5 = sc.nextDouble();
					System.out.println("Area of triangle = " + calc.triArea(length1, length2)
							+ " Perimeter of Triangle = " + (length3 + length4 + length5) + "\n");
				} else
					System.out.println("Area of triangle = " + calc.triArea(length1, length2) + "\n");
				Thread.sleep(1000);
				break;
			case "PARALLELOGRAM":
			case "PARALLEL":
			case "PRLELGRM":
			case "PARALEL":
			case "PRLEL":
				System.out.print("Enter the first side length ---> ");
				length1 = sc.nextDouble();
				System.out.print("Enter the second side length ---> ");
				length2 = sc.nextDouble();
				System.out.println("Area of parallelogram = " + calc.rectArea(length1, length2)
						+ ", Perimeter of parallelogram = " + calc.rectPerimeter(length1, length2) + "\n");
				Thread.sleep(1000);
				break;
			case "TRAPEZOID":
			case "TRPZOID":
			case "TRPZD":
			case "TRPD":
				System.out.print("Enter the length of the first base ---> ");
				length1 = sc.nextDouble();
				System.out.print("Enter the length of the second base ---> ");
				length2 = sc.nextDouble();
				System.out.print("Enter the height of the trapezoid ---> ");
				length3 = sc.nextDouble();
				System.out.println("Area of trapezoid = " + calc.trapArea(length1, length2, length3) + "\n");
				break;
			case "CUBE":
			case "CBE":
			case "CB":
				System.out.print("Enter a side length ---> ");
				length1 = sc.nextDouble();
				System.out.println("Volume of cube = " + calc.cubeVolume(length1) + ", Surface Area of square = "
						+ calc.cubeSA(length1) + "\n");
				Thread.sleep(1000);
				break;
			case "RECTANGULAR PRISM":
			case "RECT PRSM":
			case "RECTPRSM":
			case "RCTPRSM":
			case "RP":
				System.out.print("Enter the length of the prism ---> ");
				length1 = sc.nextDouble();
				System.out.print("Enter the width of the prism  ---> ");
				length2 = sc.nextDouble();
				System.out.print("Enter the height of the prism ---> ");
				length3 = sc.nextDouble();
				System.out.println("Volume of prism = " + calc.rpVolume(length1, length2, length3)
						+ " Surface Area of prism = " + calc.rpSA(length1, length2, length3) + "\n");
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