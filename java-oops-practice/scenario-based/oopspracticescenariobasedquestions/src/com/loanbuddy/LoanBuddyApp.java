package com.loanbuddy;


import java.util.*;
public class LoanBuddyApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to LoanBuddy by FinlyTech");

		System.out.print("Enter Applicant Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Credit Score: ");
		int creditScore = sc.nextInt();

		System.out.print("Enter Monthly Income: ");
		double income = sc.nextDouble();

		System.out.print("Enter Loan Amount: ");
		double loanAmount = sc.nextDouble();

		Applicant applicant = new Applicant(name, creditScore, income, loanAmount);

		System.out.println("\nSelect Loan Type:");
		System.out.println("1. Personal Loan");
		System.out.println("2. Home Loan");
		System.out.println("3. Auto Loan");
		System.out.print("Enter choice: ");
		int choice = sc.nextInt();

		System.out.print("Enter Loan Term (in months): ");
		double term = sc.nextDouble();

		LoanApplication loan = null;

		switch (choice) {
		case 1:
			loan = new PersonalLoan(term, applicant);
			break;
		case 2:
			loan = new HomeLoan(term, applicant);
			break;
		case 3:
			loan = new AutoLoan(term, applicant);
			break;
		default:
			System.out.println("Invalid loan type selected.");
			sc.close();
			return;
		}


		System.out.println("\nProcessing Loan Application...");
		loan.approveLoan();
		double emi = loan.calculateEMI();

		
		System.out.println("Loan Summary");
		System.out.println("Applicant Name : " + applicant.getName());
		System.out.println("Loan Type      : " + loan.getLoanType());
		System.out.println("Loan Amount    : ₹" + applicant.getLoanAmount());
		System.out.println("Loan Term      : " + loan.getTerm() + " months");
		System.out.println("Monthly EMI    : ₹" + String.format("%.2f", emi));

		sc.close();
	}
}
