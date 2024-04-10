package ejercicio_uno;

import java.util.ArrayList;

public class EmployeeDb {
	
	private ArrayList<Employee> employees;

	public EmployeeDb() {
		employees = new ArrayList<>();
	}

	public void addEmployee(String name, int age) {
		Employee employee = new Employee(name, age);
		employees.add(employee);
	}

	public void removeEmployee(int i) {
		employees.remove(i);
		
	}

	public void printEmployeeList() {
		for(Employee emp : employees) {
			System.out.println(emp);
		}
		
	}
}
