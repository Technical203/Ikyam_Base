package com.research.research.applicationservices.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.research.research.applicationservices.dto.EmployeeDTO;
import com.research.research.applicationservices.spi.IEmployeeRepsitory;

@Component
public class EmployeeService {

	private final Logger log = LoggerFactory.getLogger(EmployeeService.class);
	
	@Autowired
	private IEmployeeRepsitory employeeRepository;
	
	
	
	public String saveEmployee(EmployeeDTO employeeDTO) {
		
		return this.employeeRepository.saveEmployee(employeeDTO);
	}

	public EmployeeDTO getEmployeeById(String employeeId) {
		
		return this.employeeRepository.getEmployeeById(employeeId);
	}

	public String deleteEmployeeById(String employeeId) {
		
		return this.employeeRepository.deleteEmployeeById(employeeId);
	}

	public String UpdateEmployee(EmployeeDTO employeeDTO) {
		
		return this.employeeRepository.UpdateEmployee(employeeDTO);
	}
	
}