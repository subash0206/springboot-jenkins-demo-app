package com.example.employee;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmployeeDto {

    private String employeeName;

    private String department;

    private String emailId;

    private String mobileNo;
}
