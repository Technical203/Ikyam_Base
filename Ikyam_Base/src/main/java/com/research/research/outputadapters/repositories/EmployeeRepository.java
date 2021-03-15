package com.research.research.outputadapters.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.research.research.applicationservices.dto.EmployeeDTO;
import com.research.research.applicationservices.spi.IEmployeeRepsitory;
import com.research.research.outputadapters.entity.EmployeeProjection;


@Component
public class EmployeeRepository implements IEmployeeRepsitory {

	@Autowired
	private EmployeeDAO employeeDAO;
	
	
	@Override
	public String saveEmployee(EmployeeDTO employeeDTO) {
	
	
		
		EmployeeProjection employee = new EmployeeProjection();
		
		employee.setEmployeeName(employeeDTO.getEmployeeName());
		employee.setEmailId(employeeDTO.getEmailId());
		employee.setMobileNo(employeeDTO.getMobileNo());
		employee.setRole(employeeDTO.getRole());
		employee.setStatus(employeeDTO.getStatus());
		employeeDAO.save(employee);
		
		return "Employee Saved";
	}

	@Override
	public EmployeeDTO getEmployeeById(String employeeId) {
	
		EmployeeProjection employee = employeeDAO.getOne(employeeId);
		
		EmployeeDTO employeeDTO = new EmployeeDTO();
		
		employeeDTO.setEmployeeId(employee.getEmployeeId());
		employeeDTO.setEmployeeName(employee.getEmployeeName());
		employeeDTO.setMobileNo(employee.getMobileNo());
		employeeDTO.setEmailId(employee.getEmailId());
		employeeDTO.setRole(employee.getRole());
		employeeDTO.setStatus(employee.getStatus());
		
		return employeeDTO;
	}

	@Override
	public String deleteEmployeeById(String employeeId) {
		employeeDAO.deleteById(employeeId);
		return "Employee Deleted";
	}

	@Override
	public String UpdateEmployee(EmployeeDTO employeeDTO) {
		EmployeeProjection employee = employeeDAO.getOne(employeeDTO.getEmployeeId());
		
		
		employee.setEmployeeName(employeeDTO.getEmployeeName());
		employee.setMobileNo(employeeDTO.getMobileNo());
		employee.setEmailId(employeeDTO.getEmailId());
		employee.setRole(employeeDTO.getRole());
		employee.setStatus(employeeDTO.getStatus());
		
		return "Employee Updated";
	}

}