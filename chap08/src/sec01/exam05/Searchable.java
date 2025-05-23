package sec01.exam05;

public interface Searchable {
	// 추상 메소드
	// 상속관계의 추상 클래스는 선언부 실행문 같이 쓰기 때문에 다중 상속관계가 되면
	// 어떤 메소드를 써야할지 모호해짐
	// 구현관계의 추상 메소드는 선언부만 작성하기 때문에 구현부쪽에서 다중관계가 되어도..
	// 다중관계의 모든 메소드는 실행문을 다 작성해야하는데, abstract 를 사용하여 자식관계로 넘겨도..?
	void search(String url);
	
}
