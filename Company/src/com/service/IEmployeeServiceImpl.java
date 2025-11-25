package com.service;


import com.model.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IEmployeeServiceImpl implements IEmployeeService {

    public IEmployeeServiceImpl() {
    }

    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> employees;
        Device device1 = new Device ("Laptop");
        Device device2 = new Device ("PC");
        Developer employee1 = new Developer("Phuoc", 26, 5000, device1, 10);
        Tester employee2 = new Tester("Dung", 35, 5000, device2, 5);
        Developer employee3 = new Developer("Nam", 25, 5000, device1, 6);
        Developer employee4 = new Developer("Nam", 23, 5000, device1, 15);
        Tester employee5 = new Tester("Tai", 27, 5000, device1, 17);
        employees = Arrays.asList(employee1, employee2, employee3, employee4, employee5);
        return  employees;
    }

    @Override
    public Employee getEmployeeById(String id) {
        for(Employee e:getAllEmployees()){
            if(e.getId().equals(id)){
                return e;
            }
        }
        return null;
    }

    @Override
    public List<Employee> getEmployeeByName(String name) {
        List<Employee> result = new ArrayList<>();
        for(Employee e:getAllEmployees()){
            if(e.getName().equals(name)){
                result.add(e);
            }
        }
        if(result.isEmpty()){
            return null;
        }
        return result;
    }
}
