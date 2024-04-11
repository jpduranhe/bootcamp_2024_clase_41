package ejercicio_uno;

import java.util.ArrayList;

public class EmployeeDbArrayList implements EmployeeDb {

	private ArrayList<Employee> employees;

	public EmployeeDbArrayList() {
		employees = new ArrayList<>();
	}
	@Override
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	@Override
	public void removeEmployee(int i) {
		employees.remove(i);
		
	}
	@Override
	public void printEmployeeList() {
		for(Employee emp : employees) {
			System.out.println(emp);
		}
		
	}
}
