package employeemanagement;

public class Emloyeemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeService obm = new EmployeeService();
		System.out.println("employee details");
		obm.viewemp();
		obm.search();

	}

}
