package exercise1;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student>, Comparator<Student>{
	private String name;
	private int age;
	
	public Student (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	public String toString() {
		return name + " - " + age;
	}
	
	@Override
	public int compareTo(Student stu) {
		return this.name.compareTo(stu.name);
	}
	@Override
	public int compare(Student s1, Student s2) {
		if (s1.getAge() > s2.getAge()) {
			return 100;
		}
		else if (s1.getAge() < s2.getAge()) {
			return -100;
		}
		else {
			return s1.getName().compareTo(s2.getName());
		}
	}
}