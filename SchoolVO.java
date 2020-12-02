package com.school.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SchoolVO {

	private int s_id;
	private String s_firstname;
	private String s_lastname;
	private int s_level;
	private String s_course1;
	private String s_course2;
	private String s_course3;
	private String s_course4;
	private String s_course5;
	private int s_payment;
	private int s_balance;
	private int count; 
	private int result;
	

	public String getS_course1() {
		return s_course1;
	}
	public void setS_course1(String s_course1) {
		this.s_course1 = s_course1;
	}
	public String getS_course2() {
		return s_course2;
	}
	public void setS_course2(String s_course2) {
		this.s_course2 = s_course2;
	}
	public String getS_course3() {
		return s_course3;
	}
	public void setS_course3(String s_course3) {
		this.s_course3 = s_course3;
	}
	public String getS_course4() {
		return s_course4;
	}
	public void setS_course4(String s_course4) {
		this.s_course4 = s_course4;
	}
	public String getS_course5() {
		return s_course5;
	}
	public void setS_course5(String s_course5) {
		this.s_course5 = s_course5;
	}
	public String getS_firstname() {
		return s_firstname;
	}
	public void setS_firstname(String s_firstname) {
		this.s_firstname = s_firstname;
	}
	public String getS_lastname() {
		return s_lastname;
	}
	public void setS_lastname(String s_lastname) {
		this.s_lastname = s_lastname;
	}
	public int getS_level() {
		return s_level;
	}
	public void setS_level(int s_level) {
		this.s_level = s_level;
	}

	public int getS_payment() {
		return s_payment;
	}
	public void setS_payment(int  s_payment) {
		this.s_payment = s_payment;
	}
	public int getS_balance() {
		return s_balance;
	}
	public void setS_balance(int s_balance) {
		this.s_balance = s_balance;
	}
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
}