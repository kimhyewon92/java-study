package homework.studentEmployee;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Person[] students = new Person[3];
		
		students[0] = new Student("김철수", 20, 178.2, 70.0, 1, "정보시스템공학과");
		students[1] = new Student("이영희", 23, 167.0, 54.0, 4, "물리학과");
		students[2] = new Student("홍길동", 21, 197.6, 86.0, 2, "경영학과");
		
//		students[0].toString();
		
		for (Person stud : students) {
			System.out.println(stud.toString());
			
		}
		
		Person[] employees = new Person[10];
		
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		while(true) {
		System.out.println("=== 사원 입력받기 ===");
		System.out.print("이름 : ");
		employees[i].setName(sc.nextLine());
		break;
		}
		System.out.println(employees[0].name);
	}
	
}
