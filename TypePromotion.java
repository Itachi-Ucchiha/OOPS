
public class TypePromotion {
	void show(byte x) {
		System.out.println("byte X...");
	}
	void show(short x) {
		System.out.println("Short X...");
	}
//	void show(int x) {
//		System.out.println("int X...");
//	}
	void show(long x) {
		System.out.println("long X...");
	}
	void show(float x) {
		System.out.println("float X...");
	}
	void show(double x) {
		System.out.println("Double X...");
	}
	void show(Integer x) {
		System.out.println("Integer X....");
	}
	void show(Float x) {
		System.out.println("Float X....");
	}
	void show(int ...x) {
		System.out.println("Variable length arguments");
		int sum =0;
		for(int i:x) {
			sum+=i;
		}
		System.out.println(sum);
	}
	

	public static void main(String[] args) {
		TypePromotion num = new TypePromotion();
//		num.show((byte)4);
//		Integer x = 9;
//		System.out.println(x.getClass());
//		int x1 = 10;
//		Integer x1 = 10;
//		System.out.println(x.compareTo(x1));
		num.show(10,23,66);
		num.show(2,35,7,4,37,3,7);
		
	}

}
