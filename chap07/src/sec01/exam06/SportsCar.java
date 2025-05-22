package sec01.exam06;

public class SportsCar extends Car {
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	// final 메소드는 오버라이딩을 할 수 없음
//	@Override
//	public void stop() { // final 메소드여서 재정의 안됨
//		System.out.println("스포츠카를 멈춤");
//		speed = 0;
//	}
	
	
}
