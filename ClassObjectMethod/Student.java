package com.ClassObjectMethod;

public class Student {

	//variables
	     
	int studentid;
	String studentname;
	String studentcourse;
	int studentfee;

	//methods
	public void methodName1()
	{
		
		System.out.println(studentid);
		System.out.println(studentname);
		System.out.println(studentcourse);
		System.out.println(studentfee);
	}
	
	public static void main(String[] args) {

     Student s=new Student();
     s.studentid=101;
     s.studentname="Susheel";
     s.studentcourse="Testing";
     s.studentfee=10000;
     s.methodName1();
     s.methodName1();

	}
	

}
