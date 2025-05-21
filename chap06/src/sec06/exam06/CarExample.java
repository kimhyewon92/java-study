package sec06.exam06;

public class CarExample {
	
	public static void main(String[] args) {
		Car myCar = new Car();
		
//		System.out.println(myCar.speed); // 외부에서는 private 접근 불가 it is not visible (private)
		
//		myCar.speed = -50; // 직접 접근하여 잘못된 값을 막을 수 없음
		
		// 잘못된 속도 변경
		myCar.setSpeed(-50); // setter 유효성 검사를 통해 잘못된 값을 막을 수 있음
		System.out.println("현재 속도: " + myCar.getSpeed());
		
		myCar.setSpeed(60);
		System.out.println("현재 속도: " + myCar.getSpeed());
		
		// 멈춤
		if(!myCar.isStop()) { // 움직이고 있다면
			myCar.setStop(true);
		}
		System.out.println("현재 속도: " + myCar.getSpeed());
	}
	
}
