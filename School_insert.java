package com.school.dto;

import java.util.Scanner;
import com.school.dto1.SchoolDAOImpl;

public class School_insert {
	static int c = 0;
	static int[] count = new int[100];
	static int id;

	public static void main(String[] args) {
		System.out.println("몇 명을 등록하시겠습니까?");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		while (input-- > 0) {

			scan.nextLine();

			SchoolVO s1 = new SchoolVO();
			System.out.print("이름을 써주세요 :");
			s1.setS_firstname(scan.nextLine());
			System.out.print("성을 써주세요 :");
			s1.setS_lastname(scan.nextLine());
			System.out.print("학년을 써주세요 (ex: 1,2,3,4): ");
			int grade = scan.nextInt();
			s1.setS_level(grade);
			// s1.setS_level(grade);

			if (grade == 1) {
				id = s1.getCount() + 10000;
				c++;
				System.out.println(id);
			} else if (grade == 2) {
				id = s1.getCount() + 20000;
				c++;
				System.out.println(id);
			} else if (grade == 3) {
				id = s1.getCount() + 30000;
				c++;
				System.out.println(id);
			} else if (grade == 4) {
				id = s1.getCount() + 40000;
				c++;
				System.out.println(id);
			}
			int course1;
			int course2;
			int course3;
			int course4;
			int course5;
			s1.setS_id(id);
			s1.setCount(s1.getCount());
			System.out.println("학번은 " + id + " 입니다.");
			System.out.print("수학 과목을 수강하시겠습니까? (y or n 로 대답) : ");
			s1.setS_course1(scan.nextLine());
			if (s1.getS_course1() == "y") {
				course1 = 1;
			} else {
				course1 = 0;
			}
			System.out.print("역사 과목을 수강하시겠습니까? (y or n 로 대답): ");
			s1.setS_course2(scan.nextLine());
			if (s1.getS_course2() == "y") {
				course2 = 1;
			} else {
				course2 = 0;
			}
			System.out.print("화학 과목을 수강하시겠습니까? (y or n 로 대답) : ");
			s1.setS_course3(scan.nextLine());
			if (s1.getS_course3() == "y") {
				course3 = 1;
			} else {
				course3 = 0;
			}
			System.out.print("영어 과목을 수강하시겠습니까? (y or n 로 대답) : ");
			s1.setS_course4(scan.nextLine());
			System.out.println(s1.getS_course4());
			if (s1.getS_course4() == "y") {
				course4 = 1;
			} else {
				course4 = 0;
			}
			System.out.print("컴퓨터공학  과목을 수강하시겠습니까? (y or n 로 대답) : ");
			s1.setS_course5(scan.nextLine());
			if (s1.getS_course5() == "y") {
				course5 = 1;
			} else {
				course5 = 0;
			}
			System.out.println(course1);
			System.out.println(course2);
			System.out.println(course3);
			System.out.println(course4);
			System.out.println(course5);
			int price = (course1 + course2 + course3 + course4 + course5) * 60000;
			System.out.println(s1.getS_lastname() + s1.getS_firstname() + "님이 결제하실 금액은 " + price + " 원 입니다.");
			System.out.println("얼마를 결제하시겠습니까?");
			s1.setS_payment(scan.nextInt());
			System.out.println(s1.getS_payment());
			s1.setS_balance(s1.getS_payment() - price);
			String message = s1.getS_balance() + " ";
			System.out.println(message + "원의 잔액이 남았습니다.");
			System.out.println(s1.getS_level());
			SchoolDAOImpl sd = new SchoolDAOImpl();
			int re = sd.insertStudent(s1);// 레코드 저장 성공 후 레코드 행의 개수를 반환
			if (re == 1) {
				System.out.println("저장 성공~");
			}
		}
	}
}
