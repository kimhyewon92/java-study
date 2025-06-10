package sec01.exam01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class ArrayListExample {

	public static void main(String[] args) {
		// List 특징
		// 순서를 유지하며 중복 요소를 허용
		
		// 인터페이스 타입을 사용하는 이유? 다형성 사용 (new vector, linkedList 입력가능.. 상위타입으로) 
		// List 인터페이스의 다른 구현 클래스를 사용하게 되더라도
		// 코드를 수정하지 않고 새로운 기능을 추가할 수 있음
		
		// 제네릭: 자바에서 클래스나 메소드가 사용할 타입을 
		// 외부에서 파라미터처럼 받아서 사용할 수 있게 해주는 문법 
		// 타입 파라미터: 제네릭을 사용할 때 전달하는 타입
		
//		ArrayList<String> list = new ArrayList<String>();
//		List list = new ArrayList(); // 제네릭을 생략하면 Object 로 간주(권장 안함) ..안정성이 떨어짐
//		List<String> list = new ArrayList<String>();
		List<String> list = new ArrayList<>(); // 생략하면 왼쪽 List에 지정된 타입을 따라 감(타입 추론) ..객체만 저장해야해서 int 아닌 Integer 입력
		
		// 객체 추가
//		list.add(true); // 제네릭 타입으로 명시된 타입의 데이터만 추가 가능
		list.add("Java"); // 비어있는 마지막 index에 객체를 저장
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database"); // 2번 index에 "Database" 객체를 저장(뒤로 하나씩 밀려남)
		list.add("iBATIS");
		
//		list.add(7, "TEST"); // IndexOutOfBoundsException 발생
		
		// 저장된 총 객체 수 얻기
		int size = list.size();
		System.out.println("총 객체수: " + size);
		System.out.println();
		
		// 특정 인덱스의 객체 가져오기
		String skill = list.get(2);
		System.out.println("2: " + skill);
		System.out.println();
		
		// 리스트 출력하기
		System.out.println(list); // 재정의된 toString() ..toString 재정의되어있어서 해쉬가 안나옴
		System.out.println();

		// 객체 수정
		// 주어진 인덱스에 저장된 객체를 주어진 객체로 바꿈
		list.set(4, "MyBatis");
		System.out.println(list);
		System.out.println();
		
		// 모든 객체를 하나씩 가져오기
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}
		System.out.println();
		
		// 객체 삭제
		list.remove(2);
		list.remove(2);
		list.remove("MyBatis");
		System.out.println(list);
		
		// 향상된 for 문으로 모든 객체를 하나씩 가져오기
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println();
		
		// (참고만) forEach(익명 클래스[객체] 또는 람다식);
		// 함수형 프로그래밍이란 "함수를 값처럼 사용"하는 프로그래밍 방식
		list.forEach(t -> {
			System.out.println(t);
		});
		list.forEach(t -> System.out.println(t));
		
		// 객체 검색
		if (!list.isEmpty()) { // 컬렉션이 비어 있는지 조사 
			// 주어진 객체가 저장되어 있는지 조사
			System.out.println("JDBC 있니? " + list.contains("JDBC"));
			System.out.println("어디에 있니? " + list.indexOf("JDBC"));
			System.out.println("Database 있니? " + list.contains("Database"));
			System.out.println("어디에 있니? " + list.indexOf("Database"));
		}
		System.out.println();
		
		// 저장된 모든 객체 삭제
		list.clear();
		System.out.println(list.isEmpty());
		System.out.println("총 객체수: " + list.size());
		System.out.println();
		
		// 요소 정렬
		List<String> strList = new ArrayList<String>();
		strList.add("나");
		strList.add("가");
		strList.add("사");
		strList.add("하");
		strList.add("마");
		System.out.println(strList);
		
		// 오름차순
		Collections.sort(strList);
		System.out.println(strList);
		
		// 내림차순
		Collections.sort(strList, Collections.reverseOrder());
		System.out.println(strList);
		System.out.println();
		
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(11);
		numList.add(5);
		numList.add(1);
		numList.add(9);
		numList.add(3);
		System.out.println(numList);
		
		// 오름차순
		Collections.sort(numList);
		System.out.println(numList);
		
		// 내림차순
		Collections.sort(numList, Collections.reverseOrder());
		System.out.println(numList);

		
		
		
		
		
		
		
		
	}

}
