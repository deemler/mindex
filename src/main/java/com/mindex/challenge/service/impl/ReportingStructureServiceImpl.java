package com.mindex.challenge.service.impl;

import com.mindex.challenge.data.Employee;
import com.mindex.challenge.data.ReportingStructure;
import com.mindex.challenge.service.EmployeeService;
import com.mindex.challenge.service.ReportingStructureService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by DEmler on 5/20/2018.
 */
@Service
public class ReportingStructureServiceImpl implements ReportingStructureService {

	@Autowired
	private EmployeeService employeeService;

	public ReportingStructure read(String employeeId) {
		if (employeeId == null || employeeService.read(employeeId) == null) {
			throw new RuntimeException("Invalid employeeId: " + employeeId);
		}
		return new ReportingStructure(employeeService.read(employeeId), getReports(employeeService.read(employeeId)));
	}

	private int getReports(Employee employee) {
		int reports = 0;
		if (employee.getDirectReports() != null && !employee.getDirectReports().isEmpty()) {
			for (Employee reportEmployee : employee.getDirectReports()) {
				reports += getReports(employeeService.read(reportEmployee.getEmployeeId()));
				reports++;
			}
		}
		return reports;
	}
}
