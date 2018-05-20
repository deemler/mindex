package com.mindex.challenge.data;

import java.util.Date;

/**
 * Created by DEmler on 5/20/2018.
 */
public class Compensation {
	private Employee employee;
	private int salary;
	private String effectiveDate;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
}
