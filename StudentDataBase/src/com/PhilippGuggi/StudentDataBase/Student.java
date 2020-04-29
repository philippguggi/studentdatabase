package com.PhilippGuggi.StudentDataBase;

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Courses {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = "";
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	private int amountOfCourses = 0;

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

	// Getting the courses
	Courses Object101 = new Courses();
	ArrayList<String> course101 = Object101.cours101();

	Courses Object201 = new Courses();
	ArrayList<String> course201 = Object201.cours201();

	Courses Object301 = new Courses();
	ArrayList<String> course301 = Object301.cours301();

	Courses Object401 = new Courses();
	ArrayList<String> course401 = Object401.cours401();

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
			System.out.print("Enter course to enroll (Q to quit, C for courses): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (course.toUpperCase().equals("C")) {
				if (gradeYear == 1) {
					System.out.println(course101.toString().replace("[", "").replace("]", ""));
					System.out.println();
				} else if (gradeYear == 2) {
					System.out.println(course201.toString().replace("[", "").replace("]", ""));
					System.out.println();
				} else if (gradeYear == 3 ) {
					System.out.println(course301.toString().replace("[", "").replace("]", ""));
					System.out.println();
				} else {
					System.out.println(course401.toString().replace("[", "").replace("]", ""));
					System.out.println();
				};
			} else if (!course.toUpperCase().equals("Q")) {
				courses = courses + "\n " + course.substring(0, 1).toUpperCase() + course.substring(1);
				amountOfCourses++;
				tuitionBalance = costOfCourse * amountOfCourses;
				} else {	
				break;
			}
		} while(1!=0);

	}

	// View balance
	public void viewBalance() {
		System.out.println("Your balance is: € " + tuitionBalance);
	}

	// Pay tuition
	public void payTuition() {
		do {
			viewBalance();
			System.out.print("Enter your payment: € ");
			Scanner in = new Scanner(System.in);
			int payment = in.nextInt();
			tuitionBalance = tuitionBalance - payment;
			if (tuitionBalance < 0) {
				System.err.println("You are paying too much, to continue, you need to enter a lower amount.");
				tuitionBalance = costOfCourse * amountOfCourses;
				continue;
			} else {
				System.out.println("Thank your for your payment of € " + payment + ".");
				viewBalance();
				break;
			}

		} while (1 != 0);
	}

	// Show status
	public String toString() {
		return "Name: " + firstName.substring(0, 1).toUpperCase() + firstName.substring(1) + " "
				+ lastName.substring(0, 1).toUpperCase() + lastName.substring(1) + "\nGrade Level: " + gradeYear
				+ "\nStudent ID: " + studentID + "\nCourses Enrolled: " + courses + "\nBalance: € " + tuitionBalance + "\n";
	}
}