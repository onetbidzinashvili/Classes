package circle;

public class Circle {
	private double diameter;
	private double radius;
	
	public Circle() {
		this.diameter = 8.4;
		this.radius = this.diameter / 2;
	}
	public Circle(double diameter) {
		this.diameter = diameter;
		this.radius = diameter / 2;
	}
	public double squareOfCircle() {
		return Math.PI/4 * Math.pow(diameter, 2);
	}
	public double lengthOfCircle() {
		return 2 * Math.PI * radius;
	}
}
