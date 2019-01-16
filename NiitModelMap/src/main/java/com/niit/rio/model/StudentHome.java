
package com.niit.rio.model;


public class StudentHome 
{
    private int rollno;
    private String name;
    private String email;
    private AddressHome add;
    

    public StudentHome() {
    }

    public StudentHome(int rollno, String name, String email, AddressHome add) {
        this.rollno = rollno;
        this.name = name;
        this.email = email;
        this.add = add;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddressHome getAdd() {
        return add;
    }

    public void setAdd(AddressHome add) {
        this.add = add;
    }
    
     
}
