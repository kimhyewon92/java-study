package homework.studentEmployee;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Person[] students = new Person[3];
		
		students[0] = new Student("김철수", 20, 178.2, 70.0, 1, "정보시스템공학과");
		students[1] = new Student("이영희", 23, 167.0, 54.0, 4, "물리학과");
		students[2] = new Student("홍길동", 21, 197.6, 86.0, 2, "경영학과");
		
		for (Person stud : students) {
			System.out.println(stud.toString());
			
		}
		
		System.out.println("=== 사원 입력받기 ===");
		
		Employee[] employees = new Employee[10];
		
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		while(true) {
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			System.out.print("키 : ");
			double height = sc.nextDouble();
			System.out.print("몸무게 : ");
			double weight = sc.nextDouble();
			System.out.print("급여 : ");
			int salary = sc.nextInt();
			System.out.print("부서 : ");
			String dept = sc.nextLine();
			
			sc.nextLine();
			
			employees[i] = new Employee(name, age, height, weight, salary, dept);
			
			System.out.print("계속 추가하시겠습니까? ");
			String addMore = sc.nextLine();
			if (addMore.equalsIgnoreCase("y")) {
				i++;
				continue;
			} else if (addMore.equalsIgnoreCase("n")) {
				break;
			}
		}
		for (int j = 0; j <= i; j++) {
			System.out.print(employees[j].toString());
		}
//		System.out.println(employees[i].getDept());
	}
}
