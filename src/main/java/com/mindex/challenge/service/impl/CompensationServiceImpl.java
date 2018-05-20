package com.mindex.challenge.service.impl;

import com.mindex.challenge.dao.CompensationRepository;
import com.mindex.challenge.data.Compensation;
import com.mindex.challenge.data.Employee;
import com.mindex.challenge.service.CompensationService;
import com.mindex.challenge.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by DEmler on 5/20/2018.
 */
@Service
public class CompensationServiceImpl implements CompensationService {

	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private CompensationRepository compensationRepository;

	@Override
	public Compensation create(Compensation compensation) {
		if (compensation.getEmployee() == null || compensation.getEmployee().getEmployeeId() == null) {
			throw new RuntimeException("Employee or employeeId cannot be missing.");
		}

		Employee employee = employeeService.read(compensation.getEmployee().getEmployeeId());
		if (employee == null) {
			throw new RuntimeException("Invalid employeeId: " + compensation.getEmployee().getEmployeeId());
		}

		compensationRepository.insert(compensation);

		return compensation;
	}

	@Override
	public Compensation read(String id) {
		if (id == null || id.isEmpty() || employeeService.read(id) == null) {
			throw new RuntimeException("Invalid employeeId: " + id);
		}
		Employee employee = employeeService.read(id);

		return compensationRepository.findCompensationByEmployee(employee);
	}
}
