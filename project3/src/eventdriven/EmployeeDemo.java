package eventdriven;

public class EmployeeDemo {
public static void main(String[] args) {
	Employee emp=new Employee();
	method1(emp);
	emp.setName("Ahmad");
	System.out.println(emp);
	
}

private static void method1(Employee e) {
	e.setId(2);
	e.getId();
	

}
}
