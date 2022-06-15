class Customer{
	
//	static int id;
	
	static int counter;
	int id;
	String name;
	double balance;
	public Customer(String name , double balance) {
//		this.id++;			// initialized as 0............ but its a disadvantage to use this a counter
		counter++;
		this.id = counter;
		this.name = name;
		this.balance = balance;
}



public class StaticKeywordDemo {

	public static void main(String[] args) {
		Customer ram = new Customer("ram",12);
		System.out.println(ram.id+" , "+ram.name+" , "+ram.balance);

		Customer shyam = new Customer("shyam",22);
		System.out.println(shyam.id+" , "+shyam.name+" , "+shyam.balance);
		
		System.out.println(ram.id);			//showing 2 while running 2nd time instead of 1 when id was initialized as static
	}

}
}
