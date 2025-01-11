package ProxyDesignPattern;

public class Main {

	public static void main(String[] args) {
		try {
			EmployeeDAO empDAOObj = new EmployeeDAOProxy();
			empDAOObj.create("ADMIN", new Employee());
			System.out.println("Operation Successful!");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
