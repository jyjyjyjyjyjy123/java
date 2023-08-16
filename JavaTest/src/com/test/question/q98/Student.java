package com.test.question.q98;

public class Student {
	private String name;
	private int age;
	private int grade;
	private int classNumeber;
	private int number;
	public Student() {
		this("미정", 0, 0, 0, 0);		
	}
	public Student(String name,int age) {
		this(name, age, 0, 0, 0);
	}
	public Student(int grade,int classNumber,int number) {
		this("미정", 0, grade, classNumber, number);
	}
	public Student(String name,int age,int grade,int classNumber,int number) {
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.classNumeber = classNumber;
		this.number = number;
	}
	public String info() {
		System.out.printf("%s(나이: %d, 학년:%d, 반:%d, 번호: %d)\n",this.name,this.age,this.grade,this.classNumeber,this.number);
		return "";
	}
}
