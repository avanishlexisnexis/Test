package com.avanish.tutorial.spring.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.avanish.tutorial.spring.model.Employee;

@Repository
public class EmployeeDaoImp implements EmployeeDao {

   @Autowired
   private SessionFactory sessionFactory;

   @Override
   public long save(Employee emp) {
      sessionFactory.getCurrentSession().save(emp);
      return emp.getId();
   }

   @Override
   public Employee get(long id) {
      return sessionFactory.getCurrentSession().get(Employee.class, id);
   }

   @Override
   public List<Employee> list() {
      Session session = sessionFactory.getCurrentSession();
      CriteriaBuilder cb = session.getCriteriaBuilder();
      CriteriaQuery<Employee> cq = cb.createQuery(Employee.class);
      Root<Employee> root = cq.from(Employee.class);
      cq.select(root);
      Query<Employee> query = session.createQuery(cq);
      return query.getResultList();
   }

   @Override
   public void update(long id, Employee emp) {
      Session session = sessionFactory.getCurrentSession();
      Employee emp2 = session.byId(Employee.class).load(id);
      emp2.setName(emp.getName());
      emp2.setEmail(emp.getEmail());
      emp2.setAddress(emp.getAddress());
      emp2.setDob(emp.getDob());
      emp2.setSsn(emp.getSsn());
      
      session.flush();
   }

   @Override
   public void delete(long id) {
      Session session = sessionFactory.getCurrentSession();
      Employee emp = session.byId(Employee.class).load(id);
      session.delete(emp);
   }

}
