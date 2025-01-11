package ProxyDesignPattern;

public class EmployeeDAOImpl implements EmployeeDAO{

	@Override
	public void create(String client, Employee emp) throws Exception {
		System.out.println("Employee Created");
	}

	@Override
	public Employee get(String client, int empId) throws Exception {
		System.out.println("Fetching data from DB!");
		return new Employee();
	}

	@Override
	public void delete(String client, int empId) throws Exception {
		System.out.println("Deleted Employee from DB!");		
	}

}
