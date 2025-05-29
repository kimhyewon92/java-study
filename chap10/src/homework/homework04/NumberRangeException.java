package homework.homework04;

public class NumberRangeException extends Exception {
	public NumberRangeException() {
		
	}
	
	public NumberRangeException(String msg) {
		super(msg);
		// 매개변수로 받은 값을 부모 생성자로 넘기는 생성자
	}
}
