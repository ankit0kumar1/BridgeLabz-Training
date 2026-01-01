package com.objectmodeling.level1.universitymanagement;

public class Faculty {
	 private String facultyName;
	    private String subject;

	    public Faculty(String facultyName, String subject) {
	        this.facultyName = facultyName;
	        this.subject = subject;
	    }

	    public String getFacultyName() {
	        return facultyName;
	    }
}
