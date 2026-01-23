package com.universitydigitalrecord;

public class StudentNode {
	int rollNo;
	String name;
	StudentNode left, right;
	
	public StudentNode(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
		left = right = null;
	}
	
	@Override
	public String toString() {
		return rollNo + " " + name; 
		
	}
}
