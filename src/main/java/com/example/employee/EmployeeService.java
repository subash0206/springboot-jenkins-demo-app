package com.example.employee;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(EmployeeDto employeeDto) {
        Employee employee = Employee.builder()
                .employeeName(employeeDto.getEmployeeName())
                .department(employeeDto.getDepartment())
                .email(employeeDto.getEmailId())
                .mobileNo(employeeDto.getMobileNo())
                .build();
        employeeRepository.save(employee);

        return employee;
    }
 }
