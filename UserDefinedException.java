import java.util.Scanner;
//
//class CheckedException extends Exception{
//	
//}

class CheckAgeException extends RuntimeException{
	String message;
	public CheckAgeException() {
		this.message = "";
	}
	public CheckAgeException(String msg) {
		this.message = msg;
	}
	@Override 
	public String toString() {
		return "CheckAgeException [message = "+ message+"]";
	}
}

public class UserDefinedException {

	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("enter the age");
				int age = sc.nextInt();
				try {

					if(age>18) {
						System.out.println("you are eligible");
					}
					else {
						throw new CheckAgeException("You are not eligible for voting");
					}
				}
				catch(CheckAgeException e) {
					System.out.println(e);
				}
				finally {
					sc.close();				}
	}

}
