abstract class Shape {
	abstract void calcArea();
}
class Square extends Shape {
	int side;
	Square(int side) {
		this.side = side;
	}
	void calcArea() {
		double area = side * side;
		System.out.println("Area is : " + area);
	}
}
class Circle extends Shape {
	int radius;
	Square(int r) {
		radius = r;
	}
	void calcArea() {
		double area = 3.14 * radius * radius;
		System.out.println("Area is : " + area);
	}
}
class TestShape {
	public static void main(String args[])	{
		Shape obj;
		obj = new Sqaure(5);
		obj.calcArea();
		obj = new Circle(2);
		obj.calcArea();
	}
}
