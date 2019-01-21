package geometrycalculator;

public class GeometryCalculator {

	public double squareArea(double length) {
		return Math.round(length * length * 100.0) / 100.0;
	}

	public double squarePerimeter(double length) {
		return Math.round(length * 400.0) / 100.0;
	}

	public double rectArea(double length, double height) {
		return Math.round(length * height * 100.0) / 100.0;
	}

	public double rectPerimeter(double length, double height) {
		return Math.round(length * 200.0 + height * 200.0) / 100.0;
	}

	public double circArea(double rad) {
		return Math.round(100.0 * Math.PI * (rad * rad)) / 100.0;
	}

	public double circCircumf(double rad) {
		return Math.round(200.0 * Math.PI * rad) / 100.0;
	}
}
