package sec01.exam06;


public interface RemoteControl { // 객체화할수없어서 상태값을 가질수없다.
	// 상수
	int MAX_VOLUME = 10; // public static final이 자동으로 추가됨, 반드시 초기값 실행
	int MIN_VOLUME = 0;
	
	// 추상 메소드
	// 추상 메소드라서 실행 블록은 없는 상태
	// public abstract가 자동으로 추가됨
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}


