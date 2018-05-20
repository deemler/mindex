package com.mindex.challenge.data;

/**
 * Created by DEmler on 5/20/2018.
 */
public class ReportingStructure {
	private Employee employee;
	private int numberOfReports;

	public ReportingStructure(Employee employee, int numberOfReports) {
		this.employee = employee;
		this.numberOfReports = numberOfReports;
	}

	public Employee getEmployee() {
		return employee;
	}

	public int getNumberOfReports() {
		return numberOfReports;
	}
}
