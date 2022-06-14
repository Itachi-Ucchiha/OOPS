class A{
	int x;
	A(){
		System.out.println("AAAAAAAAAAAAAAAA");			// default constructor of A
	}
	A(int a){
		this();		// will run the default constructor of A
		x=100;
		System.out.println("111111111111111111111");
	}
}
class B extends A{
	int t;
	int x=50;
	B(){
		super(1);		// Will run the parameterized constructor of A 
		t=100;
		System.out.println("BBBBBBBBBBBBBBB");
	}
	B(int x){
		this(); 		// will run the default constructor of B
		int n =x+this.x+super.x;
//		x=x+t;
		System.out.println("the sum of x and t is "+n);
	}
}
public class SuperVSThis {

	public static void main(String[] args) {
		B b = new B(10);

	}

}

