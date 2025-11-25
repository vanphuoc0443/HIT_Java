package com.service;

import com.model.*;
import java.util.List;

public interface IEmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(String id);
    List<Employee> getEmployeeByName(String name);
}
