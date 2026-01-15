package com.examcell;

class Student {
	int rollNo;
	String name;
	int score;
	String center;

	Student(int rollNo, String name, int score, String center) {
		this.rollNo = rollNo;
		this.name = name;
		this.score = score;
		this.center = center;
	}

	void display() {
		System.out.println(rollNo + " | " + name + " | Score: " + score + " | Center: " + center);
	}
}
