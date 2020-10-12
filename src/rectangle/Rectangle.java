package rectangle;

public class Rectangle {
	private int length;
	private int width;
	
	public Rectangle() {
		this.length = 7;
		this.width = 4;
	}
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	public int square() {
		return length * width;
	}
	public int perimeter() {
		return length *2 + width *2;
	}
}
