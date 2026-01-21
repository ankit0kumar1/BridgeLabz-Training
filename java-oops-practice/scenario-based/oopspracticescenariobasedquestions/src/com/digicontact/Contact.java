package com.digicontact;

public class Contact {
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private Address address;
//  constructor
    public Contact(String firstName, String lastName,String phone, String email, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    //getters & Setters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName +"\nPhone: " + phone +"\nEmail: " + email +"\nAddress: " + address + "\n";
    }
}