package com.digicontact;

public class Address {
    private String city;
    private String state;
    private String zip;
    
    //Contructor
    public Address(String city, String state, String zip) {
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    
    //getter and setters
    public String getCity() {
        return city;
    }
    public String getState() {
        return state;
    }
    public String getZip() {
        return zip;
    }

    @Override
    public String toString() {
        return city + ", " + state + " - " + zip;
    }
}
