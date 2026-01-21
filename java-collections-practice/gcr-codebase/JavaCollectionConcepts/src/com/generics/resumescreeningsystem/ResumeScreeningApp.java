package com.resumescreeningsystem;

import java.util.ArrayList;
import java.util.List;

public class ResumeScreeningApp {
	public static void main(String[] args) {

        Resume<SoftwareEngineer> r1 =
                new Resume<>("Ankit", new SoftwareEngineer());

        Resume<DataScientist> r2 =
                new Resume<>("Aryan", new DataScientist());

        Resume<ProductManager> r3 =
                new Resume<>("Rahul", new ProductManager());

        ResumeScreening.screenResume(r1);
        ResumeScreening.screenResume(r2);
        ResumeScreening.screenResume(r3);

        System.out.println("\n--- Screening Pipeline ---");

        List<JobRole> roles = new ArrayList<>();
        roles.add(new SoftwareEngineer());
        roles.add(new DataScientist());
        roles.add(new ProductManager());

        ScreeningPipeline.processRoles(roles);
    }

}
