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
