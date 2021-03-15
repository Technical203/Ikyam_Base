package com.research.research.applicationservices.spi;

import java.util.List;
import org.springframework.stereotype.Component;
import com.research.research.applicationservices.dto.EmployeeDTO;
import com.research.research.outputadapters.entity.EmployeeProjection;

import org.springframework.stereotype.Component;

import com.research.research.applicationservices.dto.EmployeeDTO;

@Component
public interface IEmployeeRepsitory {

	String saveEmployee(EmployeeDTO employeeDTO);
	EmployeeDTO getEmployeeById(String employeeId);
	
	 String deleteEmployeeById(String employeeId);

	String UpdateEmployee(EmployeeDTO employeeDTO);
}
