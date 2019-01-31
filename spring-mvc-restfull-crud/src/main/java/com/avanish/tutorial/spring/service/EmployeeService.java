package com.avanish.tutorial.spring.service;

import java.util.List;

import com.avanish.tutorial.spring.model.Employee;

public interface EmployeeService {

   long save(Employee emp);
   Employee get(long id);
   List<Employee> list();
   void update(long id, Employee emp);
   void delete(long id);
}
