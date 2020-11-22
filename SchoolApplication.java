import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.school.dto.SchoolVO;

public class SchoolApplication {

	String[] io = new String[180];

	static int count = 0;
	static Scanner scan = new Scanner(System.in);
	List<String> course2 = new ArrayList<>();
	private static int a;

	public static void main(String[] args) throws Exception {

		SchoolVO school = new SchoolVO();
		SchoolApplication sa = new SchoolApplication();

		int new_EnrollNum = 0;

		do {
			if (new_EnrollNum == 0) {
				System.out.println("등록할 새로운 학생 수를 입력하시오>> ");
				Scanner sc = new Scanner(System.in);
				new_EnrollNum = Integer.parseInt(sc.nextLine());
				school.setEnrollNum(new_EnrollNum);
			}

			System.out.print("학생의 이름을 입력하시오>> ");
			Scanner sc1 = new Scanner(System.in);
			String new_StuFirstName = sc1.nextLine();
			school.setFirstName(new_StuFirstName);
			System.out.print("학생의 성을 입력하시오>> ");
			Scanner sc2 = new Scanner(System.in);
			String new_StuLastName = sc1.nextLine();
			school.setLastName(new_StuLastName);
			System.out.println("*1학년\n*2학년\n*3학년\n*4학년");
			int new_level = 0;
			do {
				System.out.print("학생의 학년을 입력하시오>> ");
				Scanner sc3 = new Scanner(System.in);
				new_level = Integer.parseInt(sc3.nextLine());
				if (new_level >= 1 && new_level <= 5) {
					school.setLevel(new_level);
				} else {

					System.out.println("숫자 1~4까지만 입력하세요! ");
				}
			} while (!(new_level >= 1 && new_level <= 5));

			school.setLevel(new_level);
			sa.course2.clear();
			while (true) {
			
				System.out.println("\n*수학\n*영어\n*역사\n*화학\n*컴퓨터");
				System.out.print("학생이 수강할 과목을 입력하시오(없으면 Q를 누르세요)>> ");

				Scanner sc4 = new Scanner(System.in);
				String course = sc4.nextLine();

				if (course.equals("q") || course.equals("ㅂ")) {
					break;

				} else if (!(course.equals("영어") || course.equals("수학") || course.equals("컴퓨터") || course.equals("화학")
						|| course.equals("역사"))) {
					System.out.println("다시 입력하세요!");

				} else {

					System.out.println();
					sa.course2.add(course);
				}
			}
			System.out.println(sa.course2.size());

			System.out.print("결제금액>> " + sa.course2.size() * 60000);

			System.out.println("\n결제할 금액을 입력하시오(숫자만)>> ");
			Scanner sc5 = new Scanner(System.in);
			int new_payment = sc5.nextInt();
			school.setPayment(new_payment);
			int new_balance = (sa.course2.size() * 60000) - new_payment;
			school.setBalance(new_balance);
			System.out.println("결제할 잔액>> " + new_balance + " 원");

			int new_studentID = school.getLevel() * 10000 + school.getCount1();

			school.getId().add(new_studentID);
			school.setStudentId(new_studentID);

			System.out.println("\n==================\n결제할 잔액: " + school.getBalance() + "\n학생 이름: "
					+ school.getLastName() + school.getFirstName() + "\n학생 학년: " + school.getLevel() + "\n학생ID :"
					+ school.getStudentId() + "\n등록된 코스: " + sa.course2 + "\n==================\n");

		} while (new_EnrollNum - 1 >= 0);
		
		school.setNew_course(sa.course2);
	}

}
