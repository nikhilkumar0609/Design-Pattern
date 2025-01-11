package ProxyDesignPattern;

public class EmployeeDAOProxy implements EmployeeDAO {
	
	EmployeeDAO empDAOObj;
	
	public EmployeeDAOProxy() {
		empDAOObj = new EmployeeDAOImpl();
	}

	@Override
	public void create(String client, Employee emp) throws Exception {
		if("ADMIN".equals(client)) {
			empDAOObj.create(client, emp);
			return;
		}

		throw new Exception("Access Denied!");
	}

	@Override
	public Employee get(String client, int empId) throws Exception {
		if("ADMIN".equals(client) || "USER".equals(client)) {
			return empDAOObj.get(client, empId);
		}
		
		throw new Exception("Access Denied!");
	}

	@Override
	public void delete(String client, int empId) throws Exception {
		if("ADMIN".equals(client)) {
			empDAOObj.delete(client, empId);
			return;
		}

		throw new Exception("Access Denied!");
	}

}
