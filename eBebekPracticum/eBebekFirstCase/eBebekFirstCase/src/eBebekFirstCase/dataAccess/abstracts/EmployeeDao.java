package eBebekFirstCase.dataAccess.abstracts;

import java.util.ArrayList;
import java.util.List;

import eBebekFirstCase.entities.concretes.Employee;

public class EmployeeDao {
	// DB simulate
	public List<Employee> employees = new ArrayList<Employee>();

	public EmployeeDao() {
		// I used this structure for ready data.
		employees.add(new Employee(1, "Yasin Özer", 10000, 35, 2010));
		employees.add(new Employee(2, "Ceylan Özer", 15000, 25, 2020));
		employees.add(new Employee(3, "Ali Atay", 8000, 45, 2009));
		employees.add(new Employee(4, "Sina Dereli", 2400, 10, 2005));
		employees.add(new Employee(5, "Chengiz Khan", 100000, 15, 2001));
	}

	public Employee getEmployeeById(int id) {
		Employee tempEmployee = null;
		for (Employee employee : getEmployees()) {
			tempEmployee = id == employee.getId() ? employee : null;
		}
		return tempEmployee;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

}
