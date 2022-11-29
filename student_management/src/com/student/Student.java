package com.student;

import java.io.Serializable;

public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int studentId;
	private String studentName;
	private long contactNumber;
	private	String emailAddress;
	
	public Student() {
		super();
	}

	public Student(int studentId, String studentName, long contactNumber, String emailAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.contactNumber = contactNumber;
		this.emailAddress = emailAddress;
	}
	
	public int getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	@Override
	public String toString() {
		return  studentId +"   " +studentName + "   " + contactNumber+ "   " + emailAddress;
	}
	
	public void display() {
		System.out.println("1.    INSERT");
		System.out.println("2.    DISPLAY");
		System.out.println("3.    SEARCH");
		System.out.println("4.    UPDATE");
		System.out.println("5.    DELETE");
		System.out.println("0.    EXIT");
	}
	
	
}
