
package com.niit.rio.model;


public class AddressHome
{
    private String city;
    private int pincode;

    public AddressHome() {
    }

    public AddressHome(String city, int pincode) {
        this.city = city;
        this.pincode = pincode;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    
}
