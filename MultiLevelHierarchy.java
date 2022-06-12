class GrandFather{
	int age = 100;
}
class Father extends GrandFather{
	int age = 55;
}
class Child extends Father{
	int age = 22;
	void son(int age) {
		System.out.println("Grandpa's age: "+((GrandFather)this).age);
		System.out.println("Father's age "+super.age);
		System.out.println("child's age "+this.age);
		int total = age + this.age  + super.age + (((GrandFather)this).age);
//		age variable is from the function, this.age is current class variable, super.age is the parent class variable
//		and (((GrandFather)this).age) is used to access the classes which are parent of parent class.
		System.out.println("Age is ; "+total);
	}
}
public class MultiLevelHierarchy {

	public static void main(String[] args) {
		Child obj = new Child();
		
		obj.son(23);
	}

}
