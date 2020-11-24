package miniapp;

public class Client {

	public static void main(String[] args) {
		Emp emp = new Emp("admin", "Bombay");
		Employee e = new EmployeeImpl(); 
		
		try {
			e.addEmployee(emp);
		} catch (UserException e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
		}
//		System.out.println("emp is added");
	}
}
