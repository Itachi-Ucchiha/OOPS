package salarySlip;

public class Employee {

	public static void main(String[] args) {
		
//		good encapsulation = data hiding (use private) + encapsulation
//		to follow the SRP - single responsibility principle (of SOLID) and DRY principle
		
		EmployeeSalarySlip Gaurav = new EmployeeSalarySlip(12, "GaUrav bORA","gaurav.bora1212@gmail.com",50000.0);
		EmployeeSalarySlip Ram = new EmployeeSalarySlip(2, "Ram","ramisram1@gmail.com",52.0);
		EmployeeSalarySlip Ajay = new EmployeeSalarySlip(15, "Ajay","mrajayrox@gmail.com",25.0);
		EmployeeSalarySlip Suhail = new EmployeeSalarySlip(16, "Suhail","maxShuhail342@gmail.com",22.0);
		System.out.println(Gaurav.showEmp());
		System.out.println("==================================================================");
		System.out.println(Ram.showEmp());
		System.out.println("==================================================================");
		System.out.println(Ajay.showEmp());
		System.out.println("==================================================================");
		System.out.println(Suhail.showEmp());
//		Gaurav.setSalary(Gaurav.getSalary()+100000);
//		Gaurav.showSalary();
//		Ram.showSalary();
//		Ajay.showSalary();
//		Suhail.showSalary();
	}

}
 