package com.school.dto;

import java.util.ArrayList;
import java.util.List;

import com.school.dto1.SchoolDAOImpl;

public class StudentList {

	public static void main(String[] args) {
		SchoolDAOImpl sdi = new SchoolDAOImpl();
		List<SchoolVO> schoollist = new ArrayList<>();

		System.out.println("id \t name \t level \t 수학 \t 역사 \t 화학 \t 영어 \t 컴퓨터공학 \t 결제한 금액 \t 결제할 금액");
		System.out.println("==============================================================================================>");
		System.out.println("목록 개수: " + schoollist.size() + "개");
		for(SchoolVO s: schoollist) {
			System.out.println(s.getS_id()+"\t"+s.getS_level()+"\t"+s.getS_lastname() + s.getS_firstname()+"\t" +s.getS_course1()+"\t"+
		s.getS_course2()+"\t"+s.getS_course3()+"\t"+s.getS_course4()+"\t"+s.getS_course5()+"\t"+s.getS_payment()+"\t"+s.getS_balance());
		}


	}

}
