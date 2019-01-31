package com.avanish.tutorial.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.avanish.tutorial.spring.dao.EmployeeDao;
import com.avanish.tutorial.spring.model.Employee;

@Service
@Transactional(readOnly = true)
public class EmployeeServiceImp implements EmployeeService {

   @Autowired
   private EmployeeDao empDao;

   @Transactional
   @Override
   public long save(Employee emp) {
      return empDao.save(emp);
   }

   @Override
   public Employee get(long id) {
      return empDao.get(id);
   }

   @Override
   public List<Employee> list() {
      return empDao.list();
   }

   @Transactional
   @Override
   public void update(long id, Employee emp) {
	   empDao.update(id, emp);
   }

   @Transactional
   @Override
   public void delete(long id) {
	   empDao.delete(id);
   }

}
