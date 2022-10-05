package eBebekFirstCase;

import eBebekFirstCase.business.concretes.EmployeeManager;
import eBebekFirstCase.dataAccess.abstracts.EmployeeDao;

public class Main {

	public static void main(String[] args) {

		EmployeeDao employeeDao = new EmployeeDao();
		System.err.println("---All Employees---");
		System.out.println(employeeDao.employees);
		System.err.println("---///---");

		EmployeeManager manager = new EmployeeManager(employeeDao);

		// show reqs
		manager.showInfos(manager, employeeDao);
	}

}
