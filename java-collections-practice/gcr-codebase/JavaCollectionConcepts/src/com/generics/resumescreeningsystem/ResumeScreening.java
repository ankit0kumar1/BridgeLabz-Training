package com.generics.resumescreeningsystem;

public class ResumeScreening {
	public static <T extends JobRole> void screenResume(Resume<T> resume) {

		System.out.println(
				"Screening resume of " + resume.getCandidateName() + " for role: " + resume.getJobRole().getRoleName());

		resume.getJobRole().screen();
	}

}
