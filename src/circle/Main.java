package circle;

public class Main {

	public static void main(String[] args) {
		Circle c = new Circle();
		Circle l = new Circle(15);
		
		System.out.println("length of circle without parameters: " + c.lengthOfCircle());
		System.out.println("Square of circle without parameters:" + c.squareOfCircle());
		System.out.println("length of circle with parameters:" + l.lengthOfCircle());
		System.out.println("Square of circle with parameters:" + l.squareOfCircle());
	}

}
