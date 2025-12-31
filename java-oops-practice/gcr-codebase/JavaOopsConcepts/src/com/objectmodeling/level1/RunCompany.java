package com.objectmodeling.level1;

public class RunCompany {
	public static void main(String[] args) {
		Company c1 = new Company("Cello");
		c1.addDepartment("Research & Development");
		c1.addDepartment("Marketing");

		c1.addEmployeeToDepartment("Research & Development" , "Ankit", 101);
		c1.addEmployeeToDepartment("Marketing", "Keshav", 201);
		
		c1.displayCompanyDetails();
	}
	
}
