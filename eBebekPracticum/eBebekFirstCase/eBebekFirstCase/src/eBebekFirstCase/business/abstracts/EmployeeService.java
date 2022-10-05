package eBebekFirstCase.business.abstracts;

import eBebekFirstCase.dataAccess.abstracts.EmployeeDao;
import eBebekFirstCase.entities.concretes.Employee;

public interface EmployeeService {

	double tax(double salary);

	double bonus(double workHours);

	double raiseSalary(Employee employee);

	void showInfos(EmployeeService employeeService, EmployeeDao employeeDao);

}
