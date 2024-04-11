package ejercicio_uno;

public class Runner {
	public static void main(String[] args) {
		
        EmployeeDb empleyeeDb = new EmployeeDbArrayList();
        empleyeeDb.addEmployee(new Manager("John", 30));
        empleyeeDb.addEmployee(new Supervisor("Alice", 25));
        //empleyeeDb.removeEmployee(1);
        empleyeeDb.printEmployeeList();
    }


}
