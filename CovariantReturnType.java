class User_{
	Features show()
	{
		Features obj1 = new Features();
		return obj1;
	}
}
class PrimeUser extends User_{
	@Override
	PrimeFeatures show() {
		PrimeFeatures obj2 = new PrimeFeatures();
		return obj2;
	}
}
class Features{
	int deliveryTime = 4;
	int shippingCost = 100;
}
class PrimeFeatures extends Features{
	int deliveryTime = 1;
	int shippingCost = 0;	
}


public class CovariantReturnType {

	public static void main(String[] args) {
	
//		COvariant Rules 
	}

}





//  second Example -----------------------------






class X1{
	int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
}
class X2 extends X1{
	String d;
	String e;

	public String getE() {
		return e;
	}

	public void setE(String e) {
		this.e = e;
	}

	public String getD() {
		return d;
	}

	public void setD(String d) {
		this.d = d;
	}
	
}
class Parent_2{
	X1 show() {
		X1 obj = new X1();
		obj.setA(22);
		return obj;
	}
}
class Child_2 extends Parent_2{
	@Override
	X2 show(){
		X2 obj1 = new X2();
		obj1.setD("Gaurav");
		obj1.setE("Bora");
		return obj1;
	}
}
class View1{
	Parent_2 p1 = new Parent_2();
	X1 tt = p1.show();
	Child_2 c1 = new Child_2();
	X2 ss = c1.show();
	void showData() {
		System.out.println(tt.getA());
		System.out.println(ss.getD()+ss.getE());
	}
	
}
public class CovariantReturnType {

	public static void main(String[] args) {
	
		View1 see = new View1();
		see.showData();
	}

}
