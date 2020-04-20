package com.PhilippGuggi.StudentDataBase;

import java.util.Scanner;

public class StudentDataBaseApp {
	public static void main(String[] args) {
		
		// Ask how many new students we want to add
		// Create n number of new students
		// Creating array of object based on a different size.
		System.out.print("Enter number of new student to enroll: ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];
		
		// Iterating through the array
		for (int i = 0; i < numOfStudents; i++) {
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
			System.out.println();
		}
		
		for (int i = 0; i < numOfStudents; i++) {
			System.out.println(students[i].toString());
		}
	}
}
