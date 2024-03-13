package com.ohgiraffers.section01.xmlconfig;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class EmployeeService {

    public List<EmployeeDTO> selectEmployee() {

        SqlSession sqlSession = getSqlSesstion();

        List<EmployeeDTO> employeeList = employeeDAO.selectEmployee(sqlSession);
        sqlSession.close();
        return employeeList;

    }
}
