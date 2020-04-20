package com.PhilippGuggi.StudentDataBase;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = "";
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;

	// Constructor: prompts user to enter student's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();

		System.out.print("Enter student last name: ");
		this.lastName = in.nextLine();

		System.out.print("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student grade level: ");
		this.gradeYear = in.nextInt();
		if (this.gradeYear > 4) {
			System.err.println("Please enter a number between 1 and 4.");
			System.out.print("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student grade level: ");
			this.gradeYear = in.nextInt();
		}
		

		setStudentID();
	}

	
	
	// Generate an ID
	private void setStudentID() {
		// Grade Level + ID
		id++;
		this.studentID = gradeYear + "" + id;
	}

	// Enroll in courses
	public void enroll() {
		// Get inside a loop, user hits Q
		do {
			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.toUpperCase().equals("Q")) {
				courses = courses + "\n" + course.substring(0, 1).toUpperCase() + course.substring(1);
				tuitionBalance = tuitionBalance + costOfCourse;
			} else {
				break;
			}
		} while (1 != 0);
	}

	// View balance
	public void viewBalance() {
		System.out.println("Your balance is: € " + tuitionBalance);
	}

	// Pay tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment: € ");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank your for your payment of € " + payment + ".");
		viewBalance();
	}

	// Show status
	public String toString() {
		return "Name: " + firstName.substring(0, 1).toUpperCase() + firstName.substring(1) + " " + lastName.substring(0, 1).toUpperCase() + lastName.substring(1) + "\nGrade Level: " + gradeYear + "\nStudent ID: " + studentID
				+ "\nCourses Enrolled: " + courses + "\nBalance: € " + tuitionBalance + "\n";
	}
}