package com.avanish.tutorial.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "Employee")
public class Employee {

   @Id
   //@GeneratedValue(strategy = GenerationType.IDENTITY)
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "custid")
   @SequenceGenerator(name = "custid", sequenceName = "CUSTOMERID")
   private Long id;
   private String name;
   private String email;
   private String address;
   private String dob;
   private String ssn;

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getDob() {
	return dob;
}

public void setDob(String dob) {
	this.dob = dob;
}

public String getSsn() {
	return ssn;
}

public void setSsn(String ssn) {
	this.ssn = ssn;
}

   
   

}
