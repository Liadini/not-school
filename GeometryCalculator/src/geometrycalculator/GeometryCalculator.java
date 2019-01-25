package geometrycalculator;

public class GeometryCalculator {

	public double squareArea(double l) {
		return Math.round(l * l * 100.0) / 100.0;
	}

	public double squarePerimeter(double l) {
		return Math.round(l * 400.0) / 100.0;
	}

	public double rectArea(double l, double h) {
		return Math.round(l * h * 100.0) / 100.0;
	}

	public double rectPerimeter(double l, double h) {
		return Math.round(l * 200.0 + h * 200.0) / 100.0;
	}

	public double circArea(double r) {
		return Math.round(100.0 * Math.PI * (r * r)) / 100.0;
	}

	public double circCircumf(double r) {
		return Math.round(200.0 * Math.PI * r) / 100.0;
	}

	public double ellipseArea(double major, double minor) {
		return Math.round(Math.PI * major * minor * 100.0) / 100.0;
	}

	public double triArea(double base, double h) {
		return Math.round(base * h / 2.0 * 100.0) / 100.0;
	}

	public double trapArea(double a, double b, double h) {
		return Math.round((a + b / 2.0) * h * 100.0) / 100.0;
	}

	public double cubeVolume(double l) {
		return Math.round(l * l * l * 100.0) / 100.0;
	}

	public double cubeSA(double l) {
		return Math.round(600.0 * (l * l)) / 100.0;
	}
	
	public double rpVolume(double l, double w, double h) {
		return Math.round(l * w * h * 100.0) / 100.0;
	}
	
	public double rpSA(double l, double w, double h) {
		return Math.round(200.0 * l * w + 200.0 * l * h + 200.0 * w * h) / 100.0;
	}
}
