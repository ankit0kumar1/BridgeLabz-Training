package com.generics.resumescreeningsystem;

class SoftwareEngineer extends JobRole {

    public SoftwareEngineer() {
        super("Software Engineer");
    }

    @Override
    public void screen() {
        System.out.println("Screening coding skills, DSA, system design");
    }
}


