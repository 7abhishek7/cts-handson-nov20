package spring;

public class Empservice {
	EmployeeDao emp=new EmployeeDao();
	public void storeEmployee() {
		emp.store();
		System.out.println("inside store Employee of EmpService");
	}
}
