package ProxyDesignPattern;

public interface EmployeeDAO {
	public void create(String client, Employee wmp) throws Exception;
	public Employee get(String client, int empId) throws Exception;
	public void delete(String client, int empId) throws Exception;
}
