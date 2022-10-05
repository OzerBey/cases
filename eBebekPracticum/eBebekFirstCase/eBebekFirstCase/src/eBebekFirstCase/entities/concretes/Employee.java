package eBebekFirstCase.entities.concretes;

import eBebekFirstCase.entities.abstracts.IPerson;

public class Employee implements IPerson {
	private int id;
	private String name;
	private double salary;
	private double workHours;
	private int hireYear;

	public Employee() {
		super();
	}

	public Employee(int id, String name, double salary, double workHours, int hireYear) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getWorkHours() {
		return workHours;
	}

	public void setWorkHours(double workHours) {
		this.workHours = workHours;
	}

	public int getHireYear() {
		return hireYear;
	}

	public void setHireYear(int hireYear) {
		this.hireYear = hireYear;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", workHours=" + workHours
				+ ", hireYear=" + hireYear + "]";
	}

}
