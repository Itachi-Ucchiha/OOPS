import java.util.Date;
import java.util.Scanner;

class Message{
	private String message;
	private Date date;
	private String userID;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	
}




class User{
	private String id;
	private String pwd;
	private String userName;
	private int age;
	private String city;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}




class View{
//	method login for user input
	void login() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the User ID: ");
		String id = sc.next();
		System.out.println("Enter the user password: ");
		String pwd = sc.next();
		System.out.println("Enter the user user name: ");
		String userName = sc.next();
		System.out.println("Enter the user age: ");
		int age = sc.nextInt();
		System.out.println("Enter user city");
		String city = sc.next();

		User user = new User();
		user.setId(id);
		user.setPwd(pwd);
		user.setUserName(userName);
		user.setAge(age);
		user.setCity(city);
			
		DB db = new DB();
		Message returned = db.checkLogin(user); // passing a object instead of large number of parameters
		System.out.println(returned.getMessage());
		System.out.println(returned.getDate());
		System.out.println(returned.getUserID());
		
	}
}


//Function Db will check the user password and name are valid and exists in dataBase
class DB{
	Message checkLogin(User user) { // problem 2 - what if there will be 50 parameters
//		String message = "";
//		Date date = null;
		Message msg = new Message();
		if(user.getId().equals(user.getPwd()))
		{
//			message = "Login success .....welcome";
			msg.setMessage("Login Sucessful... welcome user...");
			
		}
		else {
			msg.setMessage("failed");
		}
//		date = new Date();
		msg.setDate(new Date());
		msg.setUserID(user.getId());		
//		problem 1  - return id, date, message
		return msg;
	}
}


public class PassingAndReturningObject {

	public static void main(String[] args) {
		View obj = new View();
		obj.login();

	}

}
