package test_pack;

import java.util.ArrayList;

public class StudentList {
	public static ArrayList<Student> students = new  ArrayList<Student>();

	public StudentList() {
		students.add(new Student("jon1", 20, 90));
		students.add(new Student("jon2", 21, 91));
		students.add(new Student("jon3", 22, 92));	
		students.add(new Student("jon4", 23, 93));	
	}
	
	public static ArrayList<Student> filterMaxGrade (int max, ArrayList<Student> fullList ) {
		ArrayList<Student> filtered = new ArrayList<Student>();
		for (Student s : fullList) {
			if (s.getGrade() < max) {
				filtered.add(s); 
			}
		}
		return filtered;
	}
	
	public static ArrayList<Student> filterMinGrade (int min, ArrayList<Student> fullList ) {
		ArrayList<Student> filtered = new ArrayList<Student>();
		for (Student s : fullList) {
			if (s.getGrade() > min) {
				filtered.add(s); 
			}
		}
		return filtered;
	}

	public static ArrayList<Student> filterMaxAge (int max, ArrayList<Student> fullList ) {
		ArrayList<Student> filtered = new ArrayList<Student>();
		for (Student s : fullList) {
			if (s.getAge() < max) {
				filtered.add(s); 
			}
		}
		return filtered;
	}
	
	public static ArrayList<Student> filterMinAge (int min, ArrayList<Student> fullList ) {
		ArrayList<Student> filtered = new ArrayList<Student>();
		for (Student s : fullList) {
			if (s.getAge() > min) {
				filtered.add(s); 
			}
		}
		return filtered;
	}

}
