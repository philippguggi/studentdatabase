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
		cours101.add("\nMath 101");
		cours101.add("\nHistory 101");
		cours101.add("\nEngineering 101");
		cours101.add("\nEnglish 101");
		cours101.add("\nPsychology 101");
		cours101.add("\nComputer Science 101");
		cours101.add("\nPhysics 101");
		cours101.add("\nChemistry 101");
		cours101.add("\nArt 101");
		cours101.add("\nReligion 101");
		
	// Sorting the courses objects
		Collections.sort(cours101, new AlphabeticalComparator());
		for(String courses101: cours101) {
			return cours101;
		}
		return cours101;
	};
	
	protected ArrayList<String> cours201() {
		ArrayList<String> cours201 = new ArrayList<String>();
		cours201.add("\nMath 201");
		cours201.add("\nHistory 201");
		cours201.add("\nEngineering 201");
		cours201.add("\nEnglish 201");
		cours201.add("\nPsychology 201");
		cours201.add("\nComputer Science 201");
		cours201.add("\nPhysics 201");
		cours201.add("\nChemistry 201");
		cours201.add("\nArt 201");
		cours201.add("\nReligion 201");
		cours201.add("\nBusiness Administration 201");
		cours201.add("\nAccounting 201");
		
	// Sorting the courses objects
		Collections.sort(cours201, new AlphabeticalComparator());
		for(String courses201: cours201) {
			return cours201;
		}
		return cours201;
	};
	
	protected ArrayList<String> cours301() {
		ArrayList<String> cours301 = new ArrayList<String>();
		cours301.add("\nMath 301");
		cours301.add("\nHistory 301");
		cours301.add("\nEngineering 301");
		cours301.add("\nEnglish 301");
		cours301.add("\nCalculus 301");
		cours301.add("\nComputer Science 301");
		cours301.add("\nPhysics 301");
		cours301.add("\nChemistry 301");
		cours301.add("\nBusiness Administration 301");
		cours301.add("\nAccounting 301");
		
	// Sorting the courses objects
		Collections.sort(cours301, new AlphabeticalComparator());
		for(String courses301: cours301) {
			return cours301;
		}
		return cours301;
	};
	
	protected ArrayList<String> cours401() {
		ArrayList<String> cours401 = new ArrayList<String>();
		cours401.add("\nMath 401");
		cours401.add("\nHistory 401");
		cours401.add("\nEngineering 401");
		cours401.add("\nEnglish 401");
		cours401.add("\nCalculus 401");
		cours401.add("\nComputer Science 401");
		cours401.add("\nBusiness Administration 401");
		cours401.add("\nAccounting 401");
		
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