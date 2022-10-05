package eBebekFirstCase.business.concretes;

import eBebekFirstCase.business.abstracts.EmployeeService;
import eBebekFirstCase.dataAccess.abstracts.EmployeeDao;
import eBebekFirstCase.entities.concretes.Employee;

public class EmployeeManager implements EmployeeService {

	private final int CURRENT_YEAR = 2021;

	public EmployeeManager(EmployeeDao employeeDao) {
		super();
	}

	@Override
	public double tax(double salary) {
		if (salary < 1000) {
			return salary;
		}
		return salary * 0.3;
	}

	@Override
	public double bonus(double workHours) {
		double bonus = 0;
		if (workHours > 40) {
			bonus += (workHours - 40) * 30;
		}
		return bonus;
	}

	public double raiseSalary(Employee employee) {
		int year = CURRENT_YEAR - employee.getHireYear();
		double raisedSalary = 0;
		if (year < 10) {
			raisedSalary = calculateRaise(5, employee.getSalary());
		} else if (year > 9 && year < 20) {
			raisedSalary = calculateRaise(10, employee.getSalary());
		} else {
			raisedSalary = calculateRaise(15, employee.getSalary());
		}
		return raisedSalary;
	}

	private double calculateRaise(double rate, double salary) {
		return salary * (rate / 100);
	}

	@Override
	public void showInfos(EmployeeService manager, EmployeeDao employeeDao) {
		for (Employee employee : employeeDao.employees) {
			System.err.println("Before :" + employee.toString());
			System.out.println("TAX: " + manager.tax(employee.getSalary()));
			System.out.println("BONUS: " + manager.bonus(employee.getWorkHours()));
			System.out.println("RAISE SALARY: " + manager.raiseSalary(employee));
			double raisedSalary = ((manager.raiseSalary(employee) + employee.getSalary())
					- manager.tax(employee.getSalary()));
			System.out.println("RAISED SALARY: " + raisedSalary);
			employee.setSalary(raisedSalary);
			System.err.println("After :" + employee.toString());
		}
	}
}
