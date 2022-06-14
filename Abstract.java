abstract class Loan{
	void ApplyForLoan() {
		System.out.println("Apply for Loan...");
	}
	abstract void EMI();
	abstract void ROI();
}

class HomeLoan extends Loan{

	@Override
	void EMI() {
		System.out.println("Apply for the Home loan...");
		
	}

	@Override
	void ROI() {
		
		System.out.println("Apply for the roi...");
	}
	
}
class EduLoan extends Loan{

	@Override
	void EMI() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void ROI() {
		// TODO Auto-generated method stub
		
	}
	
}



public class AbstractClass {

	public static void main(String[] args) {
		

	}

}
