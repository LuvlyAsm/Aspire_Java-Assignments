package OOPs.Encaptulation;

public class Employee {
	public static void main(String[] args) {
		Employee_Management e1=new Employee_Management();
		e1.setEmployeeName("Karthik");
		System.out.println(e1.getEmployeeName());
		e1.setEmployeeId(121);
		System.out.println(e1.getEmployeeId());
		e1.setSalary(30000.00);
		System.out.println(e1.getSalary());
	}
}