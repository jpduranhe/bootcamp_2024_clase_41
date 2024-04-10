package ejercicio_uno;

public class Runner {
	public static void main(String[] args) {
		
        EmployeeDb empleyeeDb = new EmployeeDb();
        empleyeeDb.addEmployee("John", 30);
        empleyeeDb.addEmployee("Alice", 25);
        empleyeeDb.removeEmployee(1);
        empleyeeDb.printEmployeeList();
    }


}
