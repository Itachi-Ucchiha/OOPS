public class UpandDown {
//	with polymorphism
	static void caller(Shape shape) {
		if(shape instanceof  Rectangle) {
			Rectangle aa = (Rectangle) shape; // upcasting
			System.out.println(aa.area());
		}
		else if(shape instanceof Square) {
			Square aa = (Square) shape; // upcasting
			System.out.println(aa.area());
		}
		else if(shape instanceof  Circle) {
			Circle aa = (Circle) shape;	// upcasting
			System.out.println(aa.area());
		}
	}
	public static void main(String[] args) {
		caller(new Rectangle(6,4));
		caller(new Square(5));
		caller(new Circle(5));
	}
}
