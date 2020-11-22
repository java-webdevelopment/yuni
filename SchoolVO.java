package com.school.dto;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SchoolVO {

	private int enrollNum;
	private String firstName;
	private String LastName;
	private long balance;
	private int payment;
	private String course;
	private int level;
	private int studentId;
	private List<Integer> idlist = new ArrayList<Integer>();
	private List<String> new_course = new ArrayList<>();
	private int count1 = 0;
	private List<Integer> id = new ArrayList<>();
	
	
	




	public List<String> getNew_course() {
		return new_course;
	}

	public void setNew_course(List<String> new_course) {
		this.new_course = new_course;
	}

	public int getCount1() {
		return count1++;
	}

	public void setCount1(int count1) {
		this.count1 = count1;
	}

	public List<Integer> getId() {
		return id;
	}

	public void setId(List<Integer> id) {
		this.id = id;
	}

	public List<Integer> getIdlist() {
		return idlist;
	}

	public void setIdlist(List<Integer> idlist) {
		this.idlist = idlist;
	}



	private int count;


	public int getEnrollNum() {
		return enrollNum;
	}

	public void setEnrollNum(int enrollNum) {
		this.enrollNum = enrollNum;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getPayment() {
		return payment;
	}

	public void setPayment(int payment) {
		this.payment = payment;
	}


	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}



	



	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}



	public long getBalance() {
		return balance;
	}
}

