package rectangle;

public class Main {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		Rectangle t = new Rectangle(3,4);
		
		System.out.println("Square of rectangle without parameters: " + r.square());      
		System.out.println("Perimeter of rectangle without parameters: " + r.perimeter());
		System.out.println("Square of rectangle with parameters: " + t.square());
		System.out.println("Perimeter of rectangle with parameters: " + t.perimeter());
	}

}
