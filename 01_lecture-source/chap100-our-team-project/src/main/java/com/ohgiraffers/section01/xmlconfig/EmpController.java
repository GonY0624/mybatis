package com.ohgiraffers.section01.xmlconfig;

import java.util.List;

public class EmpController {

private final EmployeeService employeeService;
private final PrintResult printResult;


    public EmpController() {
        this.employeeService = new EmployeeService();
        this.printResult = new PrintResult();
    }

    public void selectEmployee() {
p
        List<EmployeeDTO> employeeList = employeeService.selectEmployee();

        if(employeeList != null){
            for(EmployeeDTO emp : employeeList){
            System.out.println(emp);
}
        } else {
            printResult.printErrorMessage("selectList");
        }


    }
}
