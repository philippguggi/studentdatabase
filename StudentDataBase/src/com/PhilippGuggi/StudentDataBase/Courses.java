package com.PhilippGuggi.StudentDataBase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class AlphabeticalComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return s1.compareTo(s2);
	}
}

public class Courses {
	protected ArrayList<String> cours101() {
		ArrayList<String> cours101 = new ArrayList<String>();
		cours101.add("Math 101");
		cours101.add("History 101");
		cours101.add("Engineering 101");
		cours101.add("English 101");
		cours101.add("Psychology 101");
		cours101.add("Computer Science 101");
		cours101.add("Physics 101");
		cours101.add("Chemistry 101");
		cours101.add("Art 101");
		cours101.add("Religion 101");
		
	// Sorting the courses objects
		Collections.sort(cours101, new AlphabeticalComparator());
		for(String courses101: cours101) {
			return cours101;
		}
		return cours101;
	};
	
	protected ArrayList<String> cours201() {
		ArrayList<String> cours201 = new ArrayList<String>();
		cours201.add("Math 201");
		cours201.add("History 201");
		cours201.add("Engineering 201");
		cours201.add("English 201");
		cours201.add("Psychology 201");
		cours201.add("Computer Science 201");
		cours201.add("Physics 201");
		cours201.add("Chemistry 201");
		cours201.add("Art 201");
		cours201.add("Religion 201");
		cours201.add("Business Administration 201");
		cours201.add("Accounting 201");
		
	// Sorting the courses objects
		Collections.sort(cours201, new AlphabeticalComparator());
		for(String courses201: cours201) {
			return cours201;
		}
		return cours201;
	};
	
	protected ArrayList<String> cours301() {
		ArrayList<String> cours301 = new ArrayList<String>();
		cours301.add("Math 301");
		cours301.add("History 301");
		cours301.add("Engineering 301");
		cours301.add("English 301");
		cours301.add("Calculus 301");
		cours301.add("Computer Science 301");
		cours301.add("Physics 301");
		cours301.add("Chemistry 301");
		cours301.add("Business Administration 301");
		cours301.add("Accounting 301");
		
	// Sorting the courses objects
		Collections.sort(cours301, new AlphabeticalComparator());
		for(String courses301: cours301) {
			return cours301;
		}
		return cours301;
	};
	
	protected ArrayList<String> cours401() {
		ArrayList<String> cours401 = new ArrayList<String>();
		cours401.add("Math 401");
		cours401.add("History 401");
		cours401.add("Engineering 401");
		cours401.add("English 401");
		cours401.add("Calculus 401");
		cours401.add("Computer Science 401");
		cours401.add("Business Administration 401");
		cours401.add("Accounting 401");
		
	// Sorting the courses objects
		Collections.sort(cours401, new AlphabeticalComparator());
		for(String courses401: cours401) {
			return cours401;
		}
		return cours401;
	};
	
	public ArrayList<String> getMyList101() {
		return cours101();
	}
	
	public ArrayList<String> getMyList201() {
		return cours201();
	}
	
	public ArrayList<String> getMyList301() {
		return cours301();
	}
	
	public ArrayList<String> getMyList401() {
		return cours401();
	}
}

		
