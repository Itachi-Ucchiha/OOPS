package salarySlip;



public class EmployeeSalarySlip {
	

//Generate salary slip
//where 
//the earnings = salary +HRA(20%) +TA(10%) + DA(10%) + MA(15%)
//deductions = TDS(15%) = PF(10%)
//Calculate total salary by earning and deductions

	private int id;
	private String name;
	private double salary;
	private String email;
	private String company;
//	default constructor
	
	public EmployeeSalarySlip() {
		this.company="        Google      ";
	}
	
//	Parameterized constructor
	
	public EmployeeSalarySlip(int id, String name, String email, double salary) {
		this();
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
	}

	
//	GETTERS AND SETTERS----------------------------------------------
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
//	-----------------------------------
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
//	-----------------------------------
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
//	----------------------------------

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
//	functions to return the basic salary after deductions and others
	public double getHRA() {
		return salary * 0.15;
	}
	
	public double getTA() {
		return salary * 0.10;
	}
	
	public double getDA() {
		return salary * 0.08;
	}
	
	public double getTDS() {
		return salary * 0.12;
	}
	
	
	public String showEmp() {
		CommonUtils utils = new CommonUtils();
		this.name = utils.getProperName(name);
		this.salary = this.salary + getHRA()+getTA()+getDA()-getTDS();
		String formattedSalary = utils.formatSalary(salary);
		String date = utils.formatDate();
		
		return "Date is : "+date+"\n"+"Name is :"+this.name+"\n"+"Net Salary is: "+formattedSalary+"\n";
		
		
	}
	

//	---------------------------------------------------------------
	

//	this class is not used for printing ...that is the work of Main 
	
//	public void showSalary() {
////		making a new object of a new class for formatting name
//		CommonUtils utils = new CommonUtils();
//		this.name = utils.getProperName(name);
//		System.out.println(this.company);
//		System.out.println("the id is "+id);
//		System.out.println("the name is "+name);
//		System.out.println("the email is "+email);
//		System.out.println("the salary is "+salary);
//		System.out.println("===========================");
//	}
	
}
