package org.student;

import org.department.Department;

public class Student extends Department{
	
	public void studentName()
	{
		System.out.println("The student name is Ramakrishna");
	}
	
	public void studentDept()
	{
		System.out.println("Student Dept is CSE");
	}	
	public void studentId()
	{
		
		System.out.println("The Student ID is :143");
		
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student();
		stu.studentDept();
		stu.studentId();
		stu.studentName();
		stu.deptName();
		stu.collegeCode();
		stu.collegeName();
		stu.collegeRank();
	}

}
