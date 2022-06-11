
public class Shape {
	int length;
	int breadth;
	Shape(){
		System.out.println("=========================");
	}
	public Shape(int a, int b) {
		this();
		this.length = a;
		this.breadth = b;
	}
	public Shape(int c) {	// constructor overloading
		this();
		this.length = c;
	}	
}
class Rectangle extends Shape{
	Rectangle(int a, int b){
		super(a,b);
	}
	int area() {
		return length*breadth;
	}
}
class Square extends Shape{
	Square(int a){
		super(a);
	}
	int Peri(){
		return 4*length;
	}
	int area(){
		return length*length;
	}
}
class Circle extends Shape{
	Circle(int a){
		super(a);
	}
	double circumference() {
		return 2*3.14*length;
	}
	double area() {
		return 3.14*length*length;
	}
}
