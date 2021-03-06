package com.mindex.challenge.controller;

import com.mindex.challenge.data.ReportingStructure;
import com.mindex.challenge.service.ReportingStructureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by DEmler on 5/20/2018.
 */
@RestController
public class ReportingStructureController {
	@Autowired
	private ReportingStructureService reportingStructureService;

	@GetMapping("/reportingStructure/{employeeId}")
	public ReportingStructure read(@PathVariable String employeeId) {
		return reportingStructureService.read(employeeId);
	}

}
