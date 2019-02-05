package test_pack;

public class Student implements Comparable<Student>{
private String name;
private int age;
private int grade;

public Student() {}

public Student(int age, int grade) {
	super();
	
	this.age = age;
	this.grade = grade;
}

public Student(String name, int age, int grade) {
	super();
	this.name = name;
	this.age = age;
	this.grade = grade;
}

public Student(String name) {
	super();
	this.name = name;
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getGrade() {
	return grade;
}
public void setGrade(int grade) {
	this.grade = grade;
}
	
@Override
public int compareTo(Student o) {
	return this.getName().compareTo(o.getName());
}
	
}
