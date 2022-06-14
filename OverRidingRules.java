class P1{
	int x =100;
	P1(){
		System.out.println("34343434343");
	}
	void show() {
		System.out.println("p1 show.......");
	}
}
class P2 extends P1{
	 int x =200;
	 P2(){
		 System.out.println("iiiiiiiiiiiiiiiiiii");
	 }
	@Override
	void show() {
		System.out.println("P2 show.......");
	}
	
}
public class OverrideVariablesVSMethods {

	public static void main(String[] args) {
		P1 obj = new P2();    // upcasting 
		System.out.println(obj.x);
		obj.show();   // P2's overrided function will run

	}

}
