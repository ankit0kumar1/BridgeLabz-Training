package com.classandobject.level1;

public class Employee {
	String name ;
	int id ;
	double salary;
	
	//constructor
	Employee(String name, int id , double salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
		
	//creating method to display employee details
	public void displayEmployee() {
		System.out.println("Employee Name: " + name );
		System.out.println("Employee id: " + id);
		System.out.println("Employee Salary: " + salary);
		
	}		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee("Rohan", 1 ,500000);//calling constructor
		emp.displayEmployee();//calling the display method
				
		
		
		
	}

}
